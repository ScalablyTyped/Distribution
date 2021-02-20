package typings.lockfileLintApi

import typings.lockfileLintApi.lockfileLintApiStrings.error
import typings.lockfileLintApi.lockfileLintApiStrings.success
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lockfile-lint-api", "ParseLockfile")
  @js.native
  class ParseLockfile protected () extends StObject {
    def this(options: ParseLockfileOptions) = this()
    
    def parseSync(): ParseLockfileResult = js.native
  }
  
  @JSImport("lockfile-lint-api", "ValidateHost")
  @js.native
  class ValidateHost protected () extends StObject {
    def this(packages: typings.lockfileLintApi.anon.Packages) = this()
    
    def validate(hosts: Hosts): ValidationResult = js.native
    def validate(hosts: Hosts, options: ValidationOptions): ValidationResult = js.native
    
    def validateSingle(packageName: String, hosts: Hosts): Boolean = js.native
  }
  
  @JSImport("lockfile-lint-api", "ValidateHttps")
  @js.native
  class ValidateHttps protected () extends StObject {
    def this(packages: typings.lockfileLintApi.anon.Packages) = this()
    
    def validate(): ValidationResult = js.native
  }
  
  @JSImport("lockfile-lint-api", "ValidateScheme")
  @js.native
  class ValidateScheme protected () extends StObject {
    def this(packages: typings.lockfileLintApi.anon.Packages) = this()
    
    def validate(schemes: js.Array[String]): ValidationResult = js.native
  }
  
  @JSImport("lockfile-lint-api", "ValidateUrl")
  @js.native
  class ValidateUrl protected () extends StObject {
    def this(packages: typings.lockfileLintApi.anon.Packages) = this()
    
    def validate(allowedUrls: js.Array[String]): ValidationResult = js.native
    def validate(allowedUrls: js.Array[String], options: ValidationOptions): ValidationResult = js.native
    
    def validateSingle(packageName: String, allowedUrls: Hosts): Boolean = js.native
  }
  
  @js.native
  trait Error extends StObject {
    
    @JSName("package")
    var _package: String = js.native
    
    var message: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(_package: String, message: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  type Hosts = js.Array[String]
  
  @js.native
  trait PackageMetadata extends StObject {
    
    var dependencies: js.UndefOr[Record[String, String]] = js.native
    
    var resolved: js.UndefOr[String] = js.native
    
    var version: String = js.native
  }
  object PackageMetadata {
    
    @scala.inline
    def apply(version: String): PackageMetadata = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageMetadata]
    }
    
    @scala.inline
    implicit class PackageMetadataMutableBuilder[Self <: PackageMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Packages = Record[String, PackageMetadata]
  
  @js.native
  trait ParseLockfileOptions extends StObject {
    
    var lockfilePath: String = js.native
    
    var lockfileType: String = js.native
  }
  object ParseLockfileOptions {
    
    @scala.inline
    def apply(lockfilePath: String, lockfileType: String): ParseLockfileOptions = {
      val __obj = js.Dynamic.literal(lockfilePath = lockfilePath.asInstanceOf[js.Any], lockfileType = lockfileType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseLockfileOptions]
    }
    
    @scala.inline
    implicit class ParseLockfileOptionsMutableBuilder[Self <: ParseLockfileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLockfilePath(value: String): Self = StObject.set(x, "lockfilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockfileType(value: String): Self = StObject.set(x, "lockfileType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseLockfileResult extends StObject {
    
    var `object`: Packages = js.native
    
    var `type`: success = js.native
  }
  object ParseLockfileResult {
    
    @scala.inline
    def apply(`object`: Packages, `type`: success): ParseLockfileResult = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseLockfileResult]
    }
    
    @scala.inline
    implicit class ParseLockfileResultMutableBuilder[Self <: ParseLockfileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: Packages): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationError extends ValidationResult {
    
    var errors: js.Array[Error] = js.native
    
    var `type`: error = js.native
  }
  object ValidationError {
    
    @scala.inline
    def apply(errors: js.Array[Error], `type`: error): ValidationError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationOptions extends StObject {
    
    var emptyHostname: js.UndefOr[Boolean] = js.native
  }
  object ValidationOptions {
    
    @scala.inline
    def apply(): ValidationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptions]
    }
    
    @scala.inline
    implicit class ValidationOptionsMutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyHostname(value: Boolean): Self = StObject.set(x, "emptyHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyHostnameUndefined: Self = StObject.set(x, "emptyHostname", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lockfileLintApi.mod.ValidationError
    - typings.lockfileLintApi.mod.ValidationSuccess
  */
  trait ValidationResult extends StObject
  object ValidationResult {
    
    @scala.inline
    def ValidationError(errors: js.Array[Error], `type`: error): typings.lockfileLintApi.mod.ValidationError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lockfileLintApi.mod.ValidationError]
    }
    
    @scala.inline
    def ValidationSuccess(`object`: Packages, `type`: success): typings.lockfileLintApi.mod.ValidationSuccess = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lockfileLintApi.mod.ValidationSuccess]
    }
  }
  
  @js.native
  trait ValidationSuccess extends ValidationResult {
    
    var `object`: Packages = js.native
    
    var `type`: success = js.native
  }
  object ValidationSuccess {
    
    @scala.inline
    def apply(`object`: Packages, `type`: success): ValidationSuccess = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationSuccess]
    }
    
    @scala.inline
    implicit class ValidationSuccessMutableBuilder[Self <: ValidationSuccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: Packages): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

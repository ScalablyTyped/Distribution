package typings.lockfileLintApi

import typings.lockfileLintApi.lockfileLintApiStrings.error
import typings.lockfileLintApi.lockfileLintApiStrings.success
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lockfile-lint-api", "ParseLockfile")
  @js.native
  open class ParseLockfile protected () extends StObject {
    def this(options: ParseLockfileOptions) = this()
    
    def parseSync(): ParseLockfileResult = js.native
  }
  
  @JSImport("lockfile-lint-api", "ValidateHost")
  @js.native
  open class ValidateHost protected () extends StObject {
    def this(packages: typings.lockfileLintApi.anon.Packages) = this()
    
    def validate(hosts: Hosts): ValidationResult = js.native
    def validate(hosts: Hosts, options: ValidationOptions): ValidationResult = js.native
    
    def validateSingle(packageName: String, hosts: Hosts): Boolean = js.native
  }
  
  @JSImport("lockfile-lint-api", "ValidateHttps")
  @js.native
  open class ValidateHttps protected () extends StObject {
    def this(packages: typings.lockfileLintApi.anon.Packages) = this()
    
    def validate(): ValidationResult = js.native
  }
  
  @JSImport("lockfile-lint-api", "ValidateScheme")
  @js.native
  open class ValidateScheme protected () extends StObject {
    def this(packages: typings.lockfileLintApi.anon.Packages) = this()
    
    def validate(schemes: js.Array[String]): ValidationResult = js.native
  }
  
  @JSImport("lockfile-lint-api", "ValidateUrl")
  @js.native
  open class ValidateUrl protected () extends StObject {
    def this(packages: typings.lockfileLintApi.anon.Packages) = this()
    
    def validate(allowedUrls: js.Array[String]): ValidationResult = js.native
    def validate(allowedUrls: js.Array[String], options: ValidationOptions): ValidationResult = js.native
    
    def validateSingle(packageName: String, allowedUrls: Hosts): Boolean = js.native
  }
  
  trait Error extends StObject {
    
    @JSName("package")
    var _package: String
    
    var message: String
  }
  object Error {
    
    inline def apply(_package: String, message: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  type Hosts = js.Array[String]
  
  trait PackageMetadata extends StObject {
    
    var dependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var resolved: js.UndefOr[String] = js.undefined
    
    var version: String
  }
  object PackageMetadata {
    
    inline def apply(version: String): PackageMetadata = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageMetadata]
    }
    
    extension [Self <: PackageMetadata](x: Self) {
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Packages = Record[String, PackageMetadata]
  
  trait ParseLockfileOptions extends StObject {
    
    var lockfilePath: String
    
    var lockfileType: String
  }
  object ParseLockfileOptions {
    
    inline def apply(lockfilePath: String, lockfileType: String): ParseLockfileOptions = {
      val __obj = js.Dynamic.literal(lockfilePath = lockfilePath.asInstanceOf[js.Any], lockfileType = lockfileType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseLockfileOptions]
    }
    
    extension [Self <: ParseLockfileOptions](x: Self) {
      
      inline def setLockfilePath(value: String): Self = StObject.set(x, "lockfilePath", value.asInstanceOf[js.Any])
      
      inline def setLockfileType(value: String): Self = StObject.set(x, "lockfileType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseLockfileResult extends StObject {
    
    var `object`: Packages
    
    var `type`: success
  }
  object ParseLockfileResult {
    
    inline def apply(`object`: Packages): ParseLockfileResult = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[ParseLockfileResult]
    }
    
    extension [Self <: ParseLockfileResult](x: Self) {
      
      inline def setObject(value: Packages): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationError
    extends StObject
       with ValidationResult {
    
    var errors: js.Array[Error]
    
    var `type`: error
  }
  object ValidationError {
    
    inline def apply(errors: js.Array[Error]): ValidationError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ValidationError]
    }
    
    extension [Self <: ValidationError](x: Self) {
      
      inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationOptions extends StObject {
    
    var emptyHostname: js.UndefOr[Boolean] = js.undefined
  }
  object ValidationOptions {
    
    inline def apply(): ValidationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptions]
    }
    
    extension [Self <: ValidationOptions](x: Self) {
      
      inline def setEmptyHostname(value: Boolean): Self = StObject.set(x, "emptyHostname", value.asInstanceOf[js.Any])
      
      inline def setEmptyHostnameUndefined: Self = StObject.set(x, "emptyHostname", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lockfileLintApi.mod.ValidationError
    - typings.lockfileLintApi.mod.ValidationSuccess
  */
  trait ValidationResult extends StObject
  object ValidationResult {
    
    inline def ValidationError(errors: js.Array[Error]): typings.lockfileLintApi.mod.ValidationError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typings.lockfileLintApi.mod.ValidationError]
    }
    
    inline def ValidationSuccess(`object`: Packages): typings.lockfileLintApi.mod.ValidationSuccess = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[typings.lockfileLintApi.mod.ValidationSuccess]
    }
  }
  
  trait ValidationSuccess
    extends StObject
       with ValidationResult {
    
    var `object`: Packages
    
    var `type`: success
  }
  object ValidationSuccess {
    
    inline def apply(`object`: Packages): ValidationSuccess = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[ValidationSuccess]
    }
    
    extension [Self <: ValidationSuccess](x: Self) {
      
      inline def setObject(value: Packages): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

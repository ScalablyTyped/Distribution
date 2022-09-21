package typings.hapiAddress.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ip {
  
  @JSImport("@hapi/address", "ip")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates a regular expression used to validate IP addresses.
    * 
    * @param options - optional settings.
    * 
    * @returns an object with the regular expression and meta data.
    */
  inline def regex(): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("regex")().asInstanceOf[Expression]
  inline def regex(options: Options): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("regex")(options.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiAddress.hapiAddressStrings.optional
    - typings.hapiAddress.hapiAddressStrings.required
    - typings.hapiAddress.hapiAddressStrings.forbidden
  */
  trait Cidr extends StObject
  object Cidr {
    
    inline def forbidden: typings.hapiAddress.hapiAddressStrings.forbidden = "forbidden".asInstanceOf[typings.hapiAddress.hapiAddressStrings.forbidden]
    
    inline def optional: typings.hapiAddress.hapiAddressStrings.optional = "optional".asInstanceOf[typings.hapiAddress.hapiAddressStrings.optional]
    
    inline def required: typings.hapiAddress.hapiAddressStrings.required = "required".asInstanceOf[typings.hapiAddress.hapiAddressStrings.required]
  }
  
  trait Expression extends StObject {
    
    /**
      * The CIDR mode.
      */
    var cidr: Cidr
    
    /**
      * The raw regular expression string.
      */
    var raw: String
    
    /**
      * The regular expression.
      */
    var regex: js.RegExp
    
    /**
      * The array of versions allowed.
      */
    var versions: js.Array[Version]
  }
  object Expression {
    
    inline def apply(cidr: Cidr, raw: String, regex: js.RegExp, versions: js.Array[Version]): Expression = {
      val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    extension [Self <: Expression](x: Self) {
      
      inline def setCidr(value: Cidr): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: Version*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The required CIDR mode.
      * 
      * @default 'optional'
      */
    val cidr: js.UndefOr[Cidr] = js.undefined
    
    /**
      * The allowed versions.
      * 
      * @default ['ipv4', 'ipv6', 'ipvfuture']
      */
    val version: js.UndefOr[Version | js.Array[Version]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCidr(value: Cidr): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      inline def setVersion(value: Version | js.Array[Version]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersionVarargs(value: Version*): Self = StObject.set(x, "version", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiAddress.hapiAddressStrings.ipv4
    - typings.hapiAddress.hapiAddressStrings.ipv6
    - typings.hapiAddress.hapiAddressStrings.ipvfuture
  */
  trait Version extends StObject
  object Version {
    
    inline def ipv4: typings.hapiAddress.hapiAddressStrings.ipv4 = "ipv4".asInstanceOf[typings.hapiAddress.hapiAddressStrings.ipv4]
    
    inline def ipv6: typings.hapiAddress.hapiAddressStrings.ipv6 = "ipv6".asInstanceOf[typings.hapiAddress.hapiAddressStrings.ipv6]
    
    inline def ipvfuture: typings.hapiAddress.hapiAddressStrings.ipvfuture = "ipvfuture".asInstanceOf[typings.hapiAddress.hapiAddressStrings.ipvfuture]
  }
}

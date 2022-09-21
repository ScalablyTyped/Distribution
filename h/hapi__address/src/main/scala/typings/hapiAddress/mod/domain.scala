package typings.hapiAddress.mod

import typings.hapiAddress.hapiAddressBooleans.`true`
import typings.hapiAddress.mod.domain.Tlds.Allow
import typings.hapiAddress.mod.domain.Tlds.Deny
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domain {
  
  @JSImport("@hapi/address", "domain")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Analyzes a string to verify it is a valid domain name.
    * 
    * @param domain - the domain name to validate.
    * @param options - optional settings.
    * 
    * @return - undefined when valid, otherwise an object with single error key with a string message value.
    */
  inline def analyze(domain: String): Analysis | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(domain.asInstanceOf[js.Any]).asInstanceOf[Analysis | Null]
  inline def analyze(domain: String, options: Options): Analysis | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analysis | Null]
  
  /**
    * Analyzes a string to verify it is a valid domain name.
    * 
    * @param domain - the domain name to validate.
    * @param options - optional settings.
    * 
    * @return - true when valid, otherwise false.
    */
  inline def isValid(domain: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(domain: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    /**
      * Determines whether Unicode characters are allowed.
      * 
      * @default true
      */
    val allowUnicode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The minimum number of domain segments (e.g. `x.y.z` has 3 segments) required.
      * 
      * @default 2
      */
    val minDomainSegments: js.UndefOr[Double] = js.undefined
    
    /**
      * Top-level-domain options
      * 
      * @default true
      */
    val tlds: js.UndefOr[Allow | Deny | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
      
      inline def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
      
      inline def setMinDomainSegments(value: Double): Self = StObject.set(x, "minDomainSegments", value.asInstanceOf[js.Any])
      
      inline def setMinDomainSegmentsUndefined: Self = StObject.set(x, "minDomainSegments", js.undefined)
      
      inline def setTlds(value: Allow | Deny | Boolean): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
      
      inline def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
    }
  }
  
  object Tlds {
    
    trait Allow extends StObject {
      
      val allow: Set[String] | `true`
    }
    object Allow {
      
      inline def apply(allow: Set[String] | `true`): Allow = {
        val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
        __obj.asInstanceOf[Allow]
      }
      
      extension [Self <: Allow](x: Self) {
        
        inline def setAllow(value: Set[String] | `true`): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      }
    }
    
    trait Deny extends StObject {
      
      val deny: Set[String]
    }
    object Deny {
      
      inline def apply(deny: Set[String]): Deny = {
        val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
        __obj.asInstanceOf[Deny]
      }
      
      extension [Self <: Deny](x: Self) {
        
        inline def setDeny(value: Set[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
      }
    }
  }
}

package typings.i18next

import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextBooleans.`true`
import typings.i18next.mod.FallbackLng
import typings.i18next.mod.FallbackLngObjList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var returnDetails: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(returnDetails = true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setReturnDetails(value: `true`): Self = StObject.set(x, "returnDetails", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllowedHosts extends StObject {
    
    /**
      * Hostnames that are allowed to send last used data.
      * Please keep those to your local system, staging, test servers (not production)
      * @default ['localhost']
      */
    var allowedHosts: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An api key if you want to send missing keys
      */
    var apiKey: js.UndefOr[String] = js.undefined
    
    /**
      * Debounce interval to send data in milliseconds
      * @default 90000
      */
    var debounceSubmit: js.UndefOr[Double] = js.undefined
    
    /**
      * The id of your locize project
      */
    var projectId: String
    
    /**
      * The reference language of your project
      * @default 'en'
      */
    var referenceLng: js.UndefOr[String] = js.undefined
    
    /**
      * Version
      * @default 'latest'
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object AllowedHosts {
    
    inline def apply(projectId: String): AllowedHosts = {
      val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowedHosts]
    }
    
    extension [Self <: AllowedHosts](x: Self) {
      
      inline def setAllowedHosts(value: js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
      
      inline def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
      
      inline def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value*))
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setDebounceSubmit(value: Double): Self = StObject.set(x, "debounceSubmit", value.asInstanceOf[js.Any])
      
      inline def setDebounceSubmitUndefined: Self = StObject.set(x, "debounceSubmit", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setReferenceLng(value: String): Self = StObject.set(x, "referenceLng", value.asInstanceOf[js.Any])
      
      inline def setReferenceLngUndefined: Self = StObject.set(x, "referenceLng", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait KeySeparator extends StObject {
    
    var keySeparator: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object KeySeparator {
    
    inline def apply(): KeySeparator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeySeparator]
    }
    
    extension [Self <: KeySeparator](x: Self) {
      
      inline def setKeySeparator(value: String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
      
      inline def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  /* Inlined std.Pick<i18next.i18next.InitOptions, 'fallbackLng'> */
  trait PickInitOptionsfallbackLn extends StObject {
    
    var fallbackLng: js.UndefOr[`false` | FallbackLng] = js.undefined
  }
  object PickInitOptionsfallbackLn {
    
    inline def apply(): PickInitOptionsfallbackLn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickInitOptionsfallbackLn]
    }
    
    extension [Self <: PickInitOptionsfallbackLn](x: Self) {
      
      inline def setFallbackLng(value: `false` | FallbackLng): Self = StObject.set(x, "fallbackLng", value.asInstanceOf[js.Any])
      
      inline def setFallbackLngFunction1(value: /* code */ String => String | js.Array[String] | FallbackLngObjList): Self = StObject.set(x, "fallbackLng", js.Any.fromFunction1(value))
      
      inline def setFallbackLngUndefined: Self = StObject.set(x, "fallbackLng", js.undefined)
      
      inline def setFallbackLngVarargs(value: String*): Self = StObject.set(x, "fallbackLng", js.Array(value*))
    }
  }
  
  /* Inlined std.Pick<i18next.i18next.InitOptions, 'keySeparator' | 'ignoreJSONStructure'> */
  trait PickInitOptionskeySeparat extends StObject {
    
    var ignoreJSONStructure: js.UndefOr[Boolean] = js.undefined
    
    var keySeparator: js.UndefOr[`false` | String] = js.undefined
  }
  object PickInitOptionskeySeparat {
    
    inline def apply(): PickInitOptionskeySeparat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickInitOptionskeySeparat]
    }
    
    extension [Self <: PickInitOptionskeySeparat](x: Self) {
      
      inline def setIgnoreJSONStructure(value: Boolean): Self = StObject.set(x, "ignoreJSONStructure", value.asInstanceOf[js.Any])
      
      inline def setIgnoreJSONStructureUndefined: Self = StObject.set(x, "ignoreJSONStructure", js.undefined)
      
      inline def setKeySeparator(value: `false` | String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
      
      inline def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
    }
  }
  
  trait ReturnDetails extends StObject {
    
    var returnDetails: `true`
    
    var returnObjects: `true`
  }
  object ReturnDetails {
    
    inline def apply(): ReturnDetails = {
      val __obj = js.Dynamic.literal(returnDetails = true, returnObjects = true)
      __obj.asInstanceOf[ReturnDetails]
    }
    
    extension [Self <: ReturnDetails](x: Self) {
      
      inline def setReturnDetails(value: `true`): Self = StObject.set(x, "returnDetails", value.asInstanceOf[js.Any])
      
      inline def setReturnObjects(value: `true`): Self = StObject.set(x, "returnObjects", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReturnObjects extends StObject {
    
    var returnObjects: `true`
  }
  object ReturnObjects {
    
    inline def apply(): ReturnObjects = {
      val __obj = js.Dynamic.literal(returnObjects = true)
      __obj.asInstanceOf[ReturnObjects]
    }
    
    extension [Self <: ReturnObjects](x: Self) {
      
      inline def setReturnObjects(value: `true`): Self = StObject.set(x, "returnObjects", value.asInstanceOf[js.Any])
    }
  }
}

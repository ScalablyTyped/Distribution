package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepo extends StObject {
  
  /**
    * How this repository mirrors a repository managed by another service. Read-only field.
    */
  var mirrorConfig: js.UndefOr[SchemaMirrorConfig] = js.undefined
  
  /**
    * Resource name of the repository, of the form `projects//repos/`. The repo name may contain slashes. eg, `projects/myproject/repos/name/with/slash`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How this repository publishes a change in the repository through Cloud Pub/Sub. Keyed by the topic names.
    */
  var pubsubConfigs: js.UndefOr[StringDictionary[SchemaPubsubConfig] | Null] = js.undefined
  
  /**
    * The disk usage of the repo, in bytes. Read-only field. Size is only returned by GetRepo.
    */
  var size: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to clone the repository from Google Cloud Source Repositories. Read-only field.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaRepo {
  
  inline def apply(): SchemaRepo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepo]
  }
  
  extension [Self <: SchemaRepo](x: Self) {
    
    inline def setMirrorConfig(value: SchemaMirrorConfig): Self = StObject.set(x, "mirrorConfig", value.asInstanceOf[js.Any])
    
    inline def setMirrorConfigUndefined: Self = StObject.set(x, "mirrorConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPubsubConfigs(value: StringDictionary[SchemaPubsubConfig]): Self = StObject.set(x, "pubsubConfigs", value.asInstanceOf[js.Any])
    
    inline def setPubsubConfigsNull: Self = StObject.set(x, "pubsubConfigs", null)
    
    inline def setPubsubConfigsUndefined: Self = StObject.set(x, "pubsubConfigs", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

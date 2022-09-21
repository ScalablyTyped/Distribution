package typings.ionicCliFramework.definitionsMod

import typings.ionicCliFramework.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandMetadataOption
  extends StObject
     with Metadata {
  
  var default: js.UndefOr[String | Boolean] = js.undefined
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var spec: js.UndefOr[Value] = js.undefined
  
  var `type`: js.UndefOr[CommandOptionType] = js.undefined
}
object CommandMetadataOption {
  
  inline def apply(name: String, summary: String): CommandMetadataOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
  
  extension [Self <: CommandMetadataOption](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setDefault(value: String | Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setSpec(value: Value): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setType(value: CommandOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

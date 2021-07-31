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
  
  @scala.inline
  def apply(name: String, summary: String): CommandMetadataOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
  
  @scala.inline
  implicit class CommandMetadataOptionMutableBuilder[Self <: CommandMetadataOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: String | Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setSpec(value: Value): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    @scala.inline
    def setType(value: CommandOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.ionic.anon

import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.ionicStrings.global
import typings.ionic.ionicStrings.project
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.Footnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.CommandMetadata> */
trait PartialCommandMetadata extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var exampleCommands: js.UndefOr[js.Array[String]] = js.undefined
  
  var footnotes: js.UndefOr[js.Array[Footnote]] = js.undefined
  
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  var inputs: js.UndefOr[js.Array[CommandMetadataInput]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[js.Array[CommandMetadataOption]] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[global | project] = js.undefined
}
object PartialCommandMetadata {
  
  inline def apply(): PartialCommandMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommandMetadata]
  }
  
  extension [Self <: PartialCommandMetadata](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExampleCommands(value: js.Array[String]): Self = StObject.set(x, "exampleCommands", value.asInstanceOf[js.Any])
    
    inline def setExampleCommandsUndefined: Self = StObject.set(x, "exampleCommands", js.undefined)
    
    inline def setExampleCommandsVarargs(value: String*): Self = StObject.set(x, "exampleCommands", js.Array(value*))
    
    inline def setFootnotes(value: js.Array[Footnote]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
    
    inline def setFootnotesUndefined: Self = StObject.set(x, "footnotes", js.undefined)
    
    inline def setFootnotesVarargs(value: Footnote*): Self = StObject.set(x, "footnotes", js.Array(value*))
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setInputs(value: js.Array[CommandMetadataInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: CommandMetadataInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Array[CommandMetadataOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: CommandMetadataOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setType(value: global | project): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

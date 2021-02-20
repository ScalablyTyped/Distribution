package typings.lowlight.lowlight

import typings.lowlight.lowlight.AST.Properties
import typings.lowlight.lowlight.AST.Unist.Node
import typings.lowlight.lowlightStrings.comment
import typings.lowlight.lowlightStrings.doctype
import typings.lowlight.lowlightStrings.element
import typings.lowlight.lowlightStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.lowlight.lowlight.AST.Root
  - typings.lowlight.lowlight.AST.Element
  - typings.lowlight.lowlight.AST.Doctype
  - typings.lowlight.lowlight.AST.Comment
  - typings.lowlight.lowlight.AST.Text
*/
trait HastNode extends StObject
object HastNode {
  
  @scala.inline
  def Comment(`type`: comment, value: String): typings.lowlight.lowlight.AST.Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.lowlight.lowlight.AST.Comment]
  }
  
  @scala.inline
  def Doctype(name: String, `type`: doctype): typings.lowlight.lowlight.AST.Doctype = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.lowlight.lowlight.AST.Doctype]
  }
  
  @scala.inline
  def Element(children: js.Array[Node], properties: Properties, tagName: String, `type`: element): typings.lowlight.lowlight.AST.Element = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.lowlight.lowlight.AST.Element]
  }
  
  @scala.inline
  def Root(children: js.Array[Node], `type`: root): typings.lowlight.lowlight.AST.Root = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.lowlight.lowlight.AST.Root]
  }
  
  @scala.inline
  def Text(`type`: String, value: String): typings.lowlight.lowlight.AST.Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.lowlight.lowlight.AST.Text]
  }
}

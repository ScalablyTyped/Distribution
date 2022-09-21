package typings.hast

import typings.hast.mod.Content
import typings.hast.mod.ElementContent
import typings.hast.mod.RootContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hastStrings {
  
  @js.native
  sealed trait children
    extends StObject
       with Content
       with ElementContent
       with RootContent
  inline def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait comment extends StObject
  inline def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait content
    extends StObject
       with Content
       with ElementContent
       with RootContent
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait doctype extends StObject
  inline def doctype: doctype = "doctype".asInstanceOf[doctype]
  
  @js.native
  sealed trait element extends StObject
  inline def element: element = "element".asInstanceOf[element]
  
  @js.native
  sealed trait name
    extends StObject
       with Content
       with RootContent
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait properties
    extends StObject
       with Content
       with ElementContent
       with RootContent
  inline def properties: properties = "properties".asInstanceOf[properties]
  
  @js.native
  sealed trait root extends StObject
  inline def root: root = "root".asInstanceOf[root]
  
  @js.native
  sealed trait tagName
    extends StObject
       with Content
       with ElementContent
       with RootContent
  inline def tagName: tagName = "tagName".asInstanceOf[tagName]
  
  @js.native
  sealed trait text extends StObject
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `type`
    extends StObject
       with Content
       with ElementContent
       with RootContent
  inline def `type`: `type` = "type".asInstanceOf[`type`]
}

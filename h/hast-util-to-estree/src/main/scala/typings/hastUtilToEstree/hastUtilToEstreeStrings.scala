package typings.hastUtilToEstree

import typings.hastUtilToEstree.libMod.EstreeJsxElementName
import typings.hastUtilToEstree.libMod.Space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hastUtilToEstreeStrings {
  
  @js.native
  sealed trait children extends StObject
  inline def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait html
    extends StObject
       with Space
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait name
    extends StObject
       with EstreeJsxElementName
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait svg
    extends StObject
       with Space
  inline def svg: svg = "svg".asInstanceOf[svg]
  
  @js.native
  sealed trait `type`
    extends StObject
       with EstreeJsxElementName
  inline def `type`: `type` = "type".asInstanceOf[`type`]
}

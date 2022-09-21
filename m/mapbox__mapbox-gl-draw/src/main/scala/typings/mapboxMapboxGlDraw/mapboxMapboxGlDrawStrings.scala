package typings.mapboxMapboxGlDraw

import typings.mapboxMapboxGlDraw.mod.DrawEventType
import typings.mapboxMapboxGlDraw.mod.DrawMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapboxMapboxGlDrawStrings {
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait direct_select
    extends StObject
       with DrawMode
  inline def direct_select: direct_select = "direct_select".asInstanceOf[direct_select]
  
  @js.native
  sealed trait drawDotactionable
    extends StObject
       with DrawEventType
  inline def drawDotactionable: drawDotactionable = "draw.actionable".asInstanceOf[drawDotactionable]
  
  @js.native
  sealed trait drawDotcombine
    extends StObject
       with DrawEventType
  inline def drawDotcombine: drawDotcombine = "draw.combine".asInstanceOf[drawDotcombine]
  
  @js.native
  sealed trait drawDotcreate
    extends StObject
       with DrawEventType
  inline def drawDotcreate: drawDotcreate = "draw.create".asInstanceOf[drawDotcreate]
  
  @js.native
  sealed trait drawDotdelete
    extends StObject
       with DrawEventType
  inline def drawDotdelete: drawDotdelete = "draw.delete".asInstanceOf[drawDotdelete]
  
  @js.native
  sealed trait drawDotmodechange
    extends StObject
       with DrawEventType
  inline def drawDotmodechange: drawDotmodechange = "draw.modechange".asInstanceOf[drawDotmodechange]
  
  @js.native
  sealed trait drawDotrender
    extends StObject
       with DrawEventType
  inline def drawDotrender: drawDotrender = "draw.render".asInstanceOf[drawDotrender]
  
  @js.native
  sealed trait drawDotselectionchange
    extends StObject
       with DrawEventType
  inline def drawDotselectionchange: drawDotselectionchange = "draw.selectionchange".asInstanceOf[drawDotselectionchange]
  
  @js.native
  sealed trait drawDotuncombine
    extends StObject
       with DrawEventType
  inline def drawDotuncombine: drawDotuncombine = "draw.uncombine".asInstanceOf[drawDotuncombine]
  
  @js.native
  sealed trait drawDotupdate
    extends StObject
       with DrawEventType
  inline def drawDotupdate: drawDotupdate = "draw.update".asInstanceOf[drawDotupdate]
  
  @js.native
  sealed trait draw_line_string
    extends StObject
       with DrawMode
  inline def draw_line_string: draw_line_string = "draw_line_string".asInstanceOf[draw_line_string]
  
  @js.native
  sealed trait draw_point
    extends StObject
       with DrawMode
  inline def draw_point: draw_point = "draw_point".asInstanceOf[draw_point]
  
  @js.native
  sealed trait draw_polygon
    extends StObject
       with DrawMode
  inline def draw_polygon: draw_polygon = "draw_polygon".asInstanceOf[draw_polygon]
  
  @js.native
  sealed trait simple_select
    extends StObject
       with DrawMode
  inline def simple_select: simple_select = "simple_select".asInstanceOf[simple_select]
  
  @js.native
  sealed trait static
    extends StObject
       with DrawMode
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait tap extends StObject
  inline def tap: tap = "tap".asInstanceOf[tap]
}

package typings.jointjs.global.joint

import typings.jointjs.jointjsStrings.anchor
import typings.jointjs.jointjsStrings.bbox
import typings.jointjs.jointjsStrings.boundary
import typings.jointjs.jointjsStrings.rectangle
import typings.jointjs.mod.connectionPoints.GenericConnectionPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionPoints {
  
  @JSGlobal("joint.connectionPoints")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("joint.connectionPoints.anchor")
  @js.native
  def anchor: GenericConnectionPoint[typings.jointjs.jointjsStrings.anchor] = js.native
  inline def anchor_=(x: GenericConnectionPoint[anchor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.connectionPoints.bbox")
  @js.native
  def bbox: GenericConnectionPoint[typings.jointjs.jointjsStrings.bbox] = js.native
  inline def bbox_=(x: GenericConnectionPoint[bbox]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bbox")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.connectionPoints.boundary")
  @js.native
  def boundary: GenericConnectionPoint[typings.jointjs.jointjsStrings.boundary] = js.native
  inline def boundary_=(x: GenericConnectionPoint[boundary]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.connectionPoints.rectangle")
  @js.native
  def rectangle: GenericConnectionPoint[typings.jointjs.jointjsStrings.rectangle] = js.native
  inline def rectangle_=(x: GenericConnectionPoint[rectangle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(x.asInstanceOf[js.Any])
}

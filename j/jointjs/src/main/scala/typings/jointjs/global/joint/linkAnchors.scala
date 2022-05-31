package typings.jointjs.global.joint

import typings.jointjs.jointjsStrings.connectionClosest
import typings.jointjs.jointjsStrings.connectionLength
import typings.jointjs.jointjsStrings.connectionPerpendicular
import typings.jointjs.jointjsStrings.connectionRatio
import typings.jointjs.mod.anchors.GenericAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkAnchors {
  
  @JSGlobal("joint.linkAnchors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("joint.linkAnchors.connectionClosest")
  @js.native
  def connectionClosest: GenericAnchor[typings.jointjs.jointjsStrings.connectionClosest] = js.native
  inline def connectionClosest_=(x: GenericAnchor[connectionClosest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionClosest")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.linkAnchors.connectionLength")
  @js.native
  def connectionLength: GenericAnchor[typings.jointjs.jointjsStrings.connectionLength] = js.native
  inline def connectionLength_=(x: GenericAnchor[connectionLength]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionLength")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.linkAnchors.connectionPerpendicular")
  @js.native
  def connectionPerpendicular: GenericAnchor[typings.jointjs.jointjsStrings.connectionPerpendicular] = js.native
  inline def connectionPerpendicular_=(x: GenericAnchor[connectionPerpendicular]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPerpendicular")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.linkAnchors.connectionRatio")
  @js.native
  def connectionRatio: GenericAnchor[typings.jointjs.jointjsStrings.connectionRatio] = js.native
  inline def connectionRatio_=(x: GenericAnchor[connectionRatio]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRatio")(x.asInstanceOf[js.Any])
}

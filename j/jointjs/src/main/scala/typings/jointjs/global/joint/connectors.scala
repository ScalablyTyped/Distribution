package typings.jointjs.global.joint

import typings.jointjs.jointjsStrings.jumpover
import typings.jointjs.jointjsStrings.normal
import typings.jointjs.jointjsStrings.rounded
import typings.jointjs.jointjsStrings.smooth
import typings.jointjs.mod.connectors.GenericConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectors {
  
  @JSGlobal("joint.connectors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("joint.connectors.jumpover")
  @js.native
  def jumpover: GenericConnector[typings.jointjs.jointjsStrings.jumpover] = js.native
  inline def jumpover_=(x: GenericConnector[jumpover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jumpover")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.connectors.normal")
  @js.native
  def normal: GenericConnector[typings.jointjs.jointjsStrings.normal] = js.native
  inline def normal_=(x: GenericConnector[normal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.connectors.rounded")
  @js.native
  def rounded: GenericConnector[typings.jointjs.jointjsStrings.rounded] = js.native
  inline def rounded_=(x: GenericConnector[rounded]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rounded")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.connectors.smooth")
  @js.native
  def smooth: GenericConnector[typings.jointjs.jointjsStrings.smooth] = js.native
  inline def smooth_=(x: GenericConnector[smooth]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smooth")(x.asInstanceOf[js.Any])
}

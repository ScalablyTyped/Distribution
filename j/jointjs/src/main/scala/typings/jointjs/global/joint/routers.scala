package typings.jointjs.global.joint

import typings.jointjs.jointjsStrings.manhattan
import typings.jointjs.jointjsStrings.metro
import typings.jointjs.jointjsStrings.normal
import typings.jointjs.jointjsStrings.oneSide
import typings.jointjs.jointjsStrings.orthogonal
import typings.jointjs.mod.routers.GenericRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routers {
  
  @JSGlobal("joint.routers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("joint.routers.manhattan")
  @js.native
  def manhattan: GenericRouter[typings.jointjs.jointjsStrings.manhattan] = js.native
  inline def manhattan_=(x: GenericRouter[manhattan]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manhattan")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.routers.metro")
  @js.native
  def metro: GenericRouter[typings.jointjs.jointjsStrings.metro] = js.native
  inline def metro_=(x: GenericRouter[metro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metro")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.routers.normal")
  @js.native
  def normal: GenericRouter[typings.jointjs.jointjsStrings.normal] = js.native
  inline def normal_=(x: GenericRouter[normal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.routers.oneSide")
  @js.native
  def oneSide: GenericRouter[typings.jointjs.jointjsStrings.oneSide] = js.native
  inline def oneSide_=(x: GenericRouter[oneSide]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oneSide")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.routers.orthogonal")
  @js.native
  def orthogonal: GenericRouter[typings.jointjs.jointjsStrings.orthogonal] = js.native
  inline def orthogonal_=(x: GenericRouter[orthogonal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orthogonal")(x.asInstanceOf[js.Any])
}

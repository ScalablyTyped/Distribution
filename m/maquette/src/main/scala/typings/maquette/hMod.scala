package typings.maquette

import typings.maquette.interfacesMod.VNode
import typings.maquette.interfacesMod.VNodeChild
import typings.maquette.interfacesMod.VNodeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hMod {
  
  @JSImport("maquette/dist/h", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def h(selector: String): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any]).asInstanceOf[VNode]
  @scala.inline
  def h(selector: String, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  @scala.inline
  def h(selector: String, properties: Unit, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  @scala.inline
  def h(selector: String, properties: VNodeProperties): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[VNode]
  @scala.inline
  def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
}

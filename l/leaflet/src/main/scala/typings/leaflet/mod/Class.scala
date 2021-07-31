package typings.leaflet.mod

import typings.leaflet.anon.TypeofClass
import typings.leaflet.anon.newargsanyanyextendpropsa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Class")
@js.native
class Class () extends StObject
/* static members */
object Class {
  
  @JSImport("leaflet", "Class")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addInitHook(initHookFn: js.Function0[Unit]): js.Any & TypeofClass = ^.asInstanceOf[js.Dynamic].applyDynamic("addInitHook")(initHookFn.asInstanceOf[js.Any]).asInstanceOf[js.Any & TypeofClass]
  @scala.inline
  def addInitHook(methodName: String, args: js.Any*): js.Any & TypeofClass = (^.asInstanceOf[js.Dynamic].applyDynamic("addInitHook")(methodName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any & TypeofClass]
  
  @scala.inline
  def extend(props: js.Any): newargsanyanyextendpropsa = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any]).asInstanceOf[newargsanyanyextendpropsa]
  
  @scala.inline
  def include(props: js.Any): js.Any & TypeofClass = ^.asInstanceOf[js.Dynamic].applyDynamic("include")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any & TypeofClass]
  
  @scala.inline
  def mergeOptions(props: js.Any): js.Any & TypeofClass = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any & TypeofClass]
}

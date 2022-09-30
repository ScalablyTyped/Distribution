package typings.leaflet.global.L

import typings.leaflet.anon.TypeofClass
import typings.leaflet.anon.newargsanyanyextendpropsa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.Class")
@js.native
open class Class ()
  extends typings.leaflet.mod.Class
/* static members */
object Class {
  
  @JSGlobal("L.Class")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addInitHook(initHookFn: js.Function0[Unit]): Any & TypeofClass = ^.asInstanceOf[js.Dynamic].applyDynamic("addInitHook")(initHookFn.asInstanceOf[js.Any]).asInstanceOf[Any & TypeofClass]
  inline def addInitHook(methodName: String, args: Any*): Any & TypeofClass = ^.asInstanceOf[js.Dynamic].applyDynamic("addInitHook")(scala.List(methodName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any & TypeofClass]
  
  inline def callInitHooks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callInitHooks")().asInstanceOf[Unit]
  
  inline def extend(props: Any): newargsanyanyextendpropsa = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any]).asInstanceOf[newargsanyanyextendpropsa]
  
  inline def include(props: Any): Any & TypeofClass = ^.asInstanceOf[js.Dynamic].applyDynamic("include")(props.asInstanceOf[js.Any]).asInstanceOf[Any & TypeofClass]
  
  inline def mergeOptions(props: Any): Any & TypeofClass = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(props.asInstanceOf[js.Any]).asInstanceOf[Any & TypeofClass]
}

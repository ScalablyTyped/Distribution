package typings.interactjsTypes

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.anon.Coords
import typings.interactjsTypes.anon.Cur
import typings.interactjsTypes.anon.Document
import typings.interactjsTypes.anon.Height
import typings.interactjsTypes.scopeMod.Scope
import typings.interactjsTypes.typesMod.PointerType
import typings.interactjsTypes.typesMod.Target
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@interactjs/core/tests/_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProps[T /* <: StringDictionary[Any] */, K /* <: /* keyof T */ String */](src: T, props: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProps")(src.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  
  inline def ltrbwh(left: Double, top: Double, right: Double, bottom: Double, width: Double, height: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("ltrbwh")(left.asInstanceOf[js.Any], top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def mockScope(): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("mockScope")().asInstanceOf[Scope]
  inline def mockScope(hasDocument: Any): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("mockScope")(hasDocument.asInstanceOf[js.Any]).asInstanceOf[Scope]
  
  inline def newCoordsSet(): Cur = ^.asInstanceOf[js.Dynamic].applyDynamic("newCoordsSet")().asInstanceOf[Cur]
  inline def newCoordsSet(n: Double): Cur = ^.asInstanceOf[js.Dynamic].applyDynamic("newCoordsSet")(n.asInstanceOf[js.Any]).asInstanceOf[Cur]
  
  inline def newPointer(): PointerType = ^.asInstanceOf[js.Dynamic].applyDynamic("newPointer")().asInstanceOf[PointerType]
  inline def newPointer(n: Double): PointerType = ^.asInstanceOf[js.Dynamic].applyDynamic("newPointer")(n.asInstanceOf[js.Any]).asInstanceOf[PointerType]
  
  inline def testEnv[T /* <: Target */](): Coords[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("testEnv")().asInstanceOf[Coords[T]]
  inline def testEnv[T /* <: Target */](hasPluginsTargetRectDocument: Document[T]): Coords[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("testEnv")(hasPluginsTargetRectDocument.asInstanceOf[js.Any]).asInstanceOf[Coords[T]]
  
  inline def timeout(n: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(n.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def unique(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[Double]
  
  inline def uniqueProps(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueProps")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

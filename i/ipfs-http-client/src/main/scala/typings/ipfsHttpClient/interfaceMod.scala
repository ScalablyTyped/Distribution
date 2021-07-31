package typings.ipfsHttpClient

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  type APIMethodWithExtraOptions[API, Key /* <: /* keyof API */ String */, Extra] = APIWithExtraOptions[
    /* import warning: importer.ImportType#apply Failed type conversion: API[Key] */ js.Any, 
    Extra
  ]
  
  type APIWithExtraOptions[API /* <: js.Function1[/* repeated */ js.Any, js.Any] */, Extra] = js.Function1[/* args */ WithExtendedOptions[Parameters[API], Extra], ReturnType[API]]
  
  type End = js.Array[scala.Nothing]
  
  type WithExtendedOptions[Params, Ext] = (js.Tuple4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any & Ext]]) | (js.Tuple3[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any & Ext]]) | (js.Tuple2[js.UndefOr[js.Any], js.UndefOr[js.Any & Ext]]) | (js.Array[js.UndefOr[(js.Any & Ext) | js.Any]])
}

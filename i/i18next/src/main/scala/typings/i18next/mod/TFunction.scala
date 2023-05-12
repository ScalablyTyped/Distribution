package typings.i18next.mod

import typings.i18next.anon.DefaultValue
import typings.i18next.anon.ReturnDetails
import typings.i18next.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TFunction[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */] extends StObject {
  
  def apply[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String): TFuncReturn[ActualNS, String, TDefaultResult, TKPrefix, Resources] = js.native
  def apply[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String, options: String): TFuncReturn[ActualNS, String, TDefaultResult, TKPrefix, Resources] = js.native
  def apply[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[ActualNS, String, TDefaultResult, TKPrefix, Resources] = js.native
  // defaultValue via options
  def apply[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, options: TOptions[TInterpolationMap] & DefaultValue): TFuncReturn[ActualNS, String, TDefaultResult, TKPrefix, Resources] = js.native
  def apply[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String): TFuncReturn[ActualNS, String, TDefaultResult, TKPrefix, Resources] = js.native
  def apply[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String, options: String): TFuncReturn[ActualNS, String, TDefaultResult, TKPrefix, Resources] = js.native
  def apply[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[ActualNS, String, TDefaultResult, TKPrefix, Resources] = js.native
  def apply[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], options: TOptions[TInterpolationMap] & DefaultValue): TFuncReturn[ActualNS, String, TDefaultResult, TKPrefix, Resources] = js.native
  // just key without options etc...
  def apply[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys): TFuncReturn[N, TKeys, TDefaultResult, TKPrefix, Resources] = js.native
  // <
  //   TKeys extends TFuncKey<N, TKPrefix> | TemplateStringsArray extends infer A ? A : never,
  //   TDefaultResult extends DefaultTFuncReturn = string,
  //   TInterpolationMap extends object = StringMap,
  // >(
  //   key: TKeys | TKeys[],
  //   options: TOptions<TInterpolationMap>,
  // ): TFuncReturn<N, TKeys, TDefaultResult, TKPrefix>;
  // defaultValue
  def apply[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<ActualNS, TKPrefix, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String): TFuncReturn[ActualNS, TKeys, TDefaultResult, TKPrefix, Resources] = js.native
  def apply[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<ActualNS, TKPrefix, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TFuncReturn[ActualNS, TKeys, TDefaultResult, TKPrefix, Resources] = js.native
  def apply[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<ActualNS, TKPrefix, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[ActualNS, TKeys, TDefaultResult, TKPrefix, Resources] = js.native
  // with returnDetails: true, returnObjects: true
  // with returnDetails: true
  def apply[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<ActualNS, TKPrefix, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap] & ReturnDetails & `0`): TFunctionDetailedResult[TFuncReturn[ActualNS, TKeys, TDefaultResult, TKPrefix, Resources]] = js.native
  def apply[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TFuncReturn[N, TKeys, TDefaultResult, TKPrefix, Resources] = js.native
}

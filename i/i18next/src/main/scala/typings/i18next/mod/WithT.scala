package typings.i18next.mod

import typings.i18next.anon.DefaultValue
import typings.i18next.anon.Ns
import typings.i18next.anon.NsPassedNS
import typings.i18next.anon.ReturnDetails
import typings.i18next.anon.ReturnObjects
import typings.i18next.anon.`0`
import typings.i18next.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */] extends StObject {
  
  // Expose parameterized t in the i18next interface hierarchy
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String, options: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  // defaultValue via options
  // Expose parameterized t in the i18next interface hierarchy
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: String, options: TOptions[TInterpolationMap] & DefaultValue): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String, options: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  def t[TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[String], options: TOptions[TInterpolationMap] & DefaultValue): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    String, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  // just key without options etc...
  // Expose parameterized t in the i18next interface hierarchy
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys): TFuncReturn[N, TKeys, TDefaultResult, Unit, Resources]
  // <
  //   TKeys extends TFuncKey<N, TKPrefix> | TemplateStringsArray extends infer A ? A : never,
  //   TDefaultResult extends DefaultTFuncReturn = string,
  //   TInterpolationMap extends object = StringMap,
  // >(
  //   key: TKeys | TKeys[],
  //   options: TOptions<TInterpolationMap>,
  // ): TFuncReturn<N, TKeys, TDefaultResult, TKPrefix>;
  // defaultValue
  // Expose parameterized t in the i18next interface hierarchy
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  // with returnDetails: true, returnObjects: true
  // Expose parameterized t in the i18next interface hierarchy
  // with returnDetails: true
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap] & ReturnDetails & `0`): TFunctionDetailedResult[
    TFuncReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
      TKeys, 
      TDefaultResult, 
      Unit, 
      Resources
    ]
  ]
  def t[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TFuncReturn[N, TKeys, TDefaultResult, Unit, Resources]
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  var t_Original: TFunction[
    N, 
    Unit, 
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any
  ]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap] & `1`): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS[TKeys /* <: TFuncKey[PassedNS, Unit, Resources] */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: TKeys): TFuncReturn[PassedNS, TKeys, TDefaultResult, Unit, Resources]
  // with returnDetails: true, returnObjects: true and ns prop in options
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS[TKeys /* <: TFuncKey[
    Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    Resources
  ] */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: TKeys, options: TOptions[TInterpolationMap] & Ns[PassedNS]): TFunctionDetailedResult[
    TFuncReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
      TKeys, 
      TDefaultResult, 
      Unit, 
      Resources
    ]
  ]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS[TKeys /* <: TFuncKey[PassedNS, Unit, Resources] */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: js.Array[TKeys]): TFuncReturn[PassedNS, TKeys, TDefaultResult, Unit, Resources]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS[TKeys /* <: TFuncKey[
    Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    Resources
  ] */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](
    key: js.Array[TKeys],
    options: TOptions[TInterpolationMap] & ReturnObjects[PassedNS] & NsPassedNS[PassedNS]
  ): TFuncReturn[PassedNS, TKeys, TDefaultResult, Unit, Resources]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNSPassedOptUsedNS[TKeys /* <: TFuncKey[UsedNS, Unit, Resources] */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, PassedOpt /* <: TOptions[TInterpolationMap] */, UsedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: js.Array[TKeys], options: PassedOpt): TFuncReturn[UsedNS, TKeys, TDefaultResult, Unit, Resources]
  // with options
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNSPassedOptUsedNS_TFuncReturn[TKeys /* <: TFuncKey[UsedNS, Unit, Resources] */, TDefaultResult /* <: DefaultTFuncReturn */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, PassedOpt /* <: TOptions[TInterpolationMap] */, UsedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: TKeys, options: PassedOpt): TFuncReturn[UsedNS, TKeys, TDefaultResult, Unit, Resources]
  // with returnObjects: true and ns prop in options
  // Expose parameterized t in the i18next interface hierarchy
  // with passed ns prop in options
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS_TFuncReturn[TKeys /* <: TFuncKey[
    Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    Resources
  ] */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: TKeys, options: TOptions[TInterpolationMap] & ReturnObjects[PassedNS] & NsPassedNS[PassedNS]): TFuncReturn[PassedNS, TKeys, TDefaultResult, Unit, Resources]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMapPassedNS_TFunctionDetailedResult[TKeys /* <: TFuncKey[
    Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
    Unit, 
    Resources
  ] */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */, PassedNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](key: js.Array[TKeys], options: TOptions[TInterpolationMap] & Ns[PassedNS]): TFunctionDetailedResult[
    TFuncReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
      TKeys, 
      TDefaultResult, 
      Unit, 
      Resources
    ]
  ]
  // with returnObjects: true
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap_TFuncReturn[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap] & `1`): TFuncReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
    TKeys, 
    TDefaultResult, 
    Unit, 
    Resources
  ]
  @JSName("t")
  def t_TKeysTDefaultResultTInterpolationMap_TFunctionDetailedResult[TKeys /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N extends null ? i18next.i18next.DefaultNamespace : N, undefined, i18next.i18next.Resources> | std.TemplateStringsArray extends infer A ? A : never */ js.Any */, TDefaultResult /* <: DefaultTFuncReturnWithObject */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap] & ReturnDetails & `0`): TFunctionDetailedResult[
    TFuncReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any, 
      TKeys, 
      TDefaultResult, 
      Unit, 
      Resources
    ]
  ]
}
object WithT {
  
  inline def apply[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](
    t: TFunction[
      N, 
      Unit, 
      /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any
    ]
  ): WithT[N] = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithT[N]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithT[?], N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */] (val x: Self & WithT[N]) extends AnyVal {
    
    inline def setT(
      value: TFunction[
          N, 
          Unit, 
          /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any
        ]
    ): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}

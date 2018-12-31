package typings
package ioDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioDashTsMod {
  type Any = Type[js.Any, js.Any, js.Any]
  type Compact[A] = ioDashTsLib.ioDashTsLibStrings.Compact with A
  type Context = js.Array[ContextEntry]
  type Decode[I, A] = js.Function1[/* i */ I, Validation[A]]
  type Encode[A, O] = js.Function1[/* a */ A, O]
  type Errors = fpDashTsLib.libArrayMod.Global.Array[ValidationError]
  type Exact[T, X /* <: T */] = T with ioDashTsLib.ioDashTsLibStrings.Exact with js.Any
  type HasProps = HasPropsRefinement | HasPropsReadonly | HasPropsIntersection | (InterfaceType[js.Any, js.Any, js.Any, js.Any]) | (StrictType[js.Any, js.Any, js.Any, js.Any]) | (PartialType[js.Any, js.Any, js.Any, js.Any])
  type InputOf[RT /* <: Any */] = /* import warning: ImportType.apply Failed type conversion: RT['_I'] */ js.Any
  type Is[A] = js.Function1[/* m */ mixed, /* is A */ scala.Boolean]
  type Mixed = Type[js.Any, js.Any, mixed]
  type OutputOf[RT /* <: Any */] = /* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any
  type OutputOfDictionary[D /* <: Any */, C /* <: Any */] = ioDashTsLib.ioDashTsLibStrings.OutputOfDictionary with js.Any
  type OutputOfPartialProps[P /* <: AnyProps */] = ioDashTsLib.ioDashTsLibStrings.OutputOfPartialProps with P
  type OutputOfProps[P /* <: AnyProps */] = ioDashTsLib.ioDashTsLibStrings.OutputOfProps with P
  type PropsOf[T /* <: ioDashTsLib.Anon_Props */] = /* import warning: ImportType.apply Failed type conversion: T['props'] */ js.Any
  type Tagged[Tag /* <: java.lang.String */, A, O] = (InterfaceType[TaggedProps[Tag], A, O, mixed]) | (StrictType[TaggedProps[Tag], A, O, mixed]) | (TaggedRefinement[Tag, A, O]) | (TaggedUnion[Tag, A, O]) | (TaggedIntersection[Tag, A, O]) | (TaggedExact[Tag, A, O]) | (RecursiveType[js.Any, A, O, mixed])
  type TaggedIntersectionArgument[Tag /* <: java.lang.String */] = (js.Array[Tagged[Tag, js.Any, js.Any]]) | (js.Tuple2[Tagged[Tag, js.Any, js.Any], Mixed]) | (js.Tuple2[Mixed, Tagged[Tag, js.Any, js.Any]]) | (js.Tuple3[Tagged[Tag, js.Any, js.Any], Mixed, Mixed]) | (js.Tuple3[Mixed, Tagged[Tag, js.Any, js.Any], Mixed]) | (js.Tuple3[Mixed, Mixed, Tagged[Tag, js.Any, js.Any]]) | (js.Tuple4[Tagged[Tag, js.Any, js.Any], Mixed, Mixed, Mixed]) | (js.Tuple4[Mixed, Tagged[Tag, js.Any, js.Any], Mixed, Mixed]) | (js.Tuple4[Mixed, Mixed, Tagged[Tag, js.Any, js.Any], Mixed]) | (js.Tuple4[Mixed, Mixed, Mixed, Tagged[Tag, js.Any, js.Any]]) | (js.Tuple5[Tagged[Tag, js.Any, js.Any], Mixed, Mixed, Mixed, Mixed]) | (js.Tuple5[Mixed, Tagged[Tag, js.Any, js.Any], Mixed, Mixed, Mixed]) | (js.Tuple5[Mixed, Mixed, Tagged[Tag, js.Any, js.Any], Mixed, Mixed]) | (js.Tuple5[Mixed, Mixed, Mixed, Tagged[Tag, js.Any, js.Any], Mixed]) | (js.Tuple5[Mixed, Mixed, Mixed, Mixed, Tagged[Tag, js.Any, js.Any]])
  type TaggedProps[Tag /* <: java.lang.String */] = ioDashTsLib.ioDashTsLibStrings.TaggedProps with js.Any
  type TypeOf[RT /* <: Any */] = /* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any
  type TypeOfDictionary[D /* <: Any */, C /* <: Any */] = ioDashTsLib.ioDashTsLibStrings.TypeOfDictionary with js.Any
  type TypeOfPartialProps[P /* <: AnyProps */] = ioDashTsLib.ioDashTsLibStrings.TypeOfPartialProps with P
  type TypeOfProps[P /* <: AnyProps */] = ioDashTsLib.ioDashTsLibStrings.TypeOfProps with P
  type Validate[I, A] = js.Function2[/* i */ I, /* context */ Context, Validation[A]]
  type Validation[A] = fpDashTsLib.libEitherMod.Either[Errors, A]
  type mixed = js.Any
}

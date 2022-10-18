package typings.ioTsTypes

import typings.fpTs.libOrdMod.Ord_
import typings.ioTs.mod.Any_
import typings.ioTs.mod.BrandC
import typings.ioTs.mod.Context
import typings.ioTs.mod.InputOf
import typings.ioTs.mod.Mixed_
import typings.ioTs.mod.OutputOf
import typings.ioTs.mod.StringC
import typings.ioTs.mod.TypeOf
import typings.ioTs.mod.Type_
import typings.ioTsTypes.libBigIntFromStringMod.BigIntFromStringC
import typings.ioTsTypes.libBooleanFromNumberMod.BooleanFromNumberC
import typings.ioTsTypes.libBooleanFromStringMod.BooleanFromStringC
import typings.ioTsTypes.libDateFromISOStringMod.DateFromISOStringC
import typings.ioTsTypes.libDateFromNumberMod.DateFromNumberC
import typings.ioTsTypes.libDateFromUnixTimeMod.DateFromUnixTimeC
import typings.ioTsTypes.libDateMod.DateC
import typings.ioTsTypes.libEitherMod.EitherC
import typings.ioTsTypes.libGetLensesMod.HasLenses
import typings.ioTsTypes.libIntFromStringMod.IntFromStringC
import typings.ioTsTypes.libNonEmptyArrayMod.NonEmptyArrayC
import typings.ioTsTypes.libNonEmptyStringMod.NonEmptyStringC
import typings.ioTsTypes.libNumberFromStringMod.NumberFromStringC
import typings.ioTsTypes.libOptionFromNullableMod.OptionFromNullableC
import typings.ioTsTypes.libOptionMod.OptionC
import typings.ioTsTypes.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArrayC
import typings.ioTsTypes.libReadonlySetFromArrayMod.ReadonlySetFromArrayC
import typings.ioTsTypes.libRegexpMod.RegExpC
import typings.ioTsTypes.libSetFromArrayMod.SetFromArrayC
import typings.ioTsTypes.libUuidMod.UUIDBrand
import typings.newtypeTs.mod.AnyNewtype
import typings.newtypeTs.mod.CarrierOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("io-ts-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts-types", "BigIntFromString")
  @js.native
  val BigIntFromString: BigIntFromStringC = js.native
  
  @JSImport("io-ts-types", "BooleanFromNumber")
  @js.native
  val BooleanFromNumber: BooleanFromNumberC = js.native
  
  @JSImport("io-ts-types", "BooleanFromString")
  @js.native
  val BooleanFromString: BooleanFromStringC = js.native
  
  @JSImport("io-ts-types", "DateFromISOString")
  @js.native
  val DateFromISOString: DateFromISOStringC = js.native
  
  @JSImport("io-ts-types", "DateFromNumber")
  @js.native
  val DateFromNumber: DateFromNumberC = js.native
  
  @JSImport("io-ts-types", "DateFromUnixTime")
  @js.native
  val DateFromUnixTime: DateFromUnixTimeC = js.native
  
  @JSImport("io-ts-types", "IntFromString")
  @js.native
  val IntFromString: IntFromStringC = js.native
  
  @JSImport("io-ts-types", "Json")
  @js.native
  val Json: Type_[
    typings.ioTsTypes.libJsonFromStringMod.Json, 
    typings.ioTsTypes.libJsonFromStringMod.Json, 
    Any
  ] = js.native
  
  @JSImport("io-ts-types", "JsonArray")
  @js.native
  val JsonArray: Type_[
    typings.ioTsTypes.libJsonFromStringMod.JsonArray, 
    typings.ioTsTypes.libJsonFromStringMod.JsonArray, 
    Any
  ] = js.native
  
  @JSImport("io-ts-types", "JsonFromString")
  @js.native
  val JsonFromString: Type_[typings.ioTsTypes.libJsonFromStringMod.Json, String, String] = js.native
  
  @JSImport("io-ts-types", "JsonRecord")
  @js.native
  val JsonRecord: Type_[
    typings.ioTsTypes.libJsonFromStringMod.JsonRecord, 
    typings.ioTsTypes.libJsonFromStringMod.JsonRecord, 
    Any
  ] = js.native
  
  @JSImport("io-ts-types", "NonEmptyString")
  @js.native
  val NonEmptyString: NonEmptyStringC = js.native
  
  @JSImport("io-ts-types", "NumberFromString")
  @js.native
  val NumberFromString: NumberFromStringC = js.native
  
  @JSImport("io-ts-types", "UUID")
  @js.native
  val UUID: BrandC[StringC, UUIDBrand] = js.native
  
  inline def clone_[C /* <: Any_ */](t: C): C = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(t.asInstanceOf[js.Any]).asInstanceOf[C]
  
  @JSImport("io-ts-types", "date")
  @js.native
  val date: DateC = js.native
  
  inline def either[L /* <: Mixed_ */, R /* <: Mixed_ */](leftCodec: L, rightCodec: R): EitherC[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(leftCodec.asInstanceOf[js.Any], rightCodec.asInstanceOf[js.Any])).asInstanceOf[EitherC[L, R]]
  inline def either[L /* <: Mixed_ */, R /* <: Mixed_ */](leftCodec: L, rightCodec: R, name: String): EitherC[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(leftCodec.asInstanceOf[js.Any], rightCodec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[EitherC[L, R]]
  
  inline def fromNewtype[N /* <: AnyNewtype */](codec: Type_[CarrierOf[N], OutputOf[CarrierOf[N]], Any]): Type_[N, CarrierOf[N], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNewtype")(codec.asInstanceOf[js.Any]).asInstanceOf[Type_[N, CarrierOf[N], Any]]
  inline def fromNewtype[N /* <: AnyNewtype */](codec: Type_[CarrierOf[N], OutputOf[CarrierOf[N]], Any], name: String): Type_[N, CarrierOf[N], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNewtype")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Type_[N, CarrierOf[N], Any]]
  
  inline def fromNullable[C /* <: Mixed_ */](codec: C, a: TypeOf[C]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(codec.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def fromNullable[C /* <: Mixed_ */](codec: C, a: TypeOf[C], name: String): C = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(codec.asInstanceOf[js.Any], a.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def fromRefinement[A](name: String, is: js.Function1[/* u */ Any, /* is A */ Boolean]): Type_[A, A, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRefinement")(name.asInstanceOf[js.Any], is.asInstanceOf[js.Any])).asInstanceOf[Type_[A, A, Any]]
  
  inline def getLenses[C /* <: HasLenses */](codec: C): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof io-ts.io-ts.TypeOf<C> ]: monocle-ts.monocle-ts.Lens<io-ts.io-ts.TypeOf<C>, io-ts.io-ts.TypeOf<C>[K]>} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLenses")(codec.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof io-ts.io-ts.TypeOf<C> ]: monocle-ts.monocle-ts.Lens<io-ts.io-ts.TypeOf<C>, io-ts.io-ts.TypeOf<C>[K]>} */ js.Any]
  
  inline def mapOutput[A, O, I, P](codec: Type_[A, O, I], f: js.Function1[/* p */ O, P]): Type_[A, P, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapOutput")(codec.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Type_[A, P, I]]
  inline def mapOutput[A, O, I, P](codec: Type_[A, O, I], f: js.Function1[/* p */ O, P], name: String): Type_[A, P, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapOutput")(codec.asInstanceOf[js.Any], f.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Type_[A, P, I]]
  
  inline def nonEmptyArray[C /* <: Mixed_ */](codec: C): NonEmptyArrayC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptyArray")(codec.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArrayC[C]]
  inline def nonEmptyArray[C /* <: Mixed_ */](codec: C, name: String): NonEmptyArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptyArray")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArrayC[C]]
  
  inline def option[C /* <: Mixed_ */](codec: C): OptionC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(codec.asInstanceOf[js.Any]).asInstanceOf[OptionC[C]]
  inline def option[C /* <: Mixed_ */](codec: C, name: String): OptionC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[OptionC[C]]
  
  inline def optionFromNullable[C /* <: Mixed_ */](codec: C): OptionFromNullableC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("optionFromNullable")(codec.asInstanceOf[js.Any]).asInstanceOf[OptionFromNullableC[C]]
  inline def optionFromNullable[C /* <: Mixed_ */](codec: C, name: String): OptionFromNullableC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionFromNullable")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[OptionFromNullableC[C]]
  
  inline def readonlyNonEmptyArray[C /* <: Mixed_ */](codec: C): ReadonlyNonEmptyArrayC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonlyNonEmptyArray")(codec.asInstanceOf[js.Any]).asInstanceOf[ReadonlyNonEmptyArrayC[C]]
  inline def readonlyNonEmptyArray[C /* <: Mixed_ */](codec: C, name: String): ReadonlyNonEmptyArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlyNonEmptyArray")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArrayC[C]]
  
  inline def readonlySetFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]]): ReadonlySetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlySetFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any])).asInstanceOf[ReadonlySetFromArrayC[C]]
  inline def readonlySetFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]], name: String): ReadonlySetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlySetFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ReadonlySetFromArrayC[C]]
  
  @JSImport("io-ts-types", "regexp")
  @js.native
  val regexp: RegExpC = js.native
  
  inline def setFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]]): SetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("setFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any])).asInstanceOf[SetFromArrayC[C]]
  inline def setFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]], name: String): SetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("setFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[SetFromArrayC[C]]
  
  inline def withEncode[A, O, I, P](codec: Type_[A, O, I], encode: js.Function1[/* a */ A, P]): Type_[A, P, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("withEncode")(codec.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[Type_[A, P, I]]
  inline def withEncode[A, O, I, P](codec: Type_[A, O, I], encode: js.Function1[/* a */ A, P], name: String): Type_[A, P, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("withEncode")(codec.asInstanceOf[js.Any], encode.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Type_[A, P, I]]
  
  inline def withFallback[C /* <: Any_ */](codec: C, a: TypeOf[C]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withFallback")(codec.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def withFallback[C /* <: Any_ */](codec: C, a: TypeOf[C], name: String): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withFallback")(codec.asInstanceOf[js.Any], a.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def withMessage[C /* <: Any_ */](codec: C, message: js.Function2[/* i */ InputOf[C], /* c */ Context, String]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withMessage")(codec.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def withValidate_validate[C /* <: Any_ */](
    codec: C,
    validate: /* import warning: importer.ImportType#apply Failed type conversion: C['validate'] */ js.Any
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withValidate")(codec.asInstanceOf[js.Any], validate.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def withValidate_validate[C /* <: Any_ */](
    codec: C,
    validate: /* import warning: importer.ImportType#apply Failed type conversion: C['validate'] */ js.Any,
    name: String
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withValidate")(codec.asInstanceOf[js.Any], validate.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[C]
}

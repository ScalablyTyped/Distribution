package typings.ioTs

import typings.fpTs.libAltMod.Alt2C
import typings.fpTs.libApplicativeMod.Applicative2C
import typings.fpTs.libApplyMod.Apply2C
import typings.fpTs.libBifunctorMod.Bifunctor2
import typings.fpTs.libFunctionMod.Lazy
import typings.fpTs.libFunctionMod.Refinement
import typings.fpTs.libFunctorMod.Functor2C
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonadThrowMod.MonadThrow2C
import typings.ioTs.libSchemableMod.Literal
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKleisliMod {
  
  @JSImport("io-ts/lib/Kleisli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](A: Alt2C[F, E]): js.Function1[
    /* that */ Lazy[Kleisli[F, Any, E, Any]], 
    js.Function1[/* me */ Kleisli[F, Any, E, Any], Kleisli[F, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(A.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* that */ Lazy[Kleisli[F, Any, E, Any]], 
    js.Function1[/* me */ Kleisli[F, Any, E, Any], Kleisli[F, Any, E, Any]]
  ]]
  
  inline def compose[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function1[
    /* ab */ Kleisli[M, Any, E, Any], 
    js.Function1[/* ia */ Kleisli[M, Any, E, Any], Kleisli[M, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ab */ Kleisli[M, Any, E, Any], 
    js.Function1[/* ia */ Kleisli[M, Any, E, Any], Kleisli[M, Any, E, Any]]
  ]]
  
  inline def fromArray[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onItemError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[/* item */ Kleisli[M, Any, E, Any], Kleisli[M, js.Array[Any], E, js.Array[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onItemError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[/* item */ Kleisli[M, Any, E, Any], Kleisli[M, js.Array[Any], E, js.Array[Any]]]
  ]]
  
  inline def fromPartial[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
        ], 
        E, 
        Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
        ]
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartial")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
        ], 
        E, 
        Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
        ]
      ]
    ]
  ]]
  
  inline def fromRecord[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onKeyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* codomain */ Kleisli[M, Any, E, Any], 
      Kleisli[M, Record[String, Any], E, Record[String, Any]]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRecord")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onKeyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* codomain */ Kleisli[M, Any, E, Any], 
      Kleisli[M, Record[String, Any], E, Record[String, Any]]
    ]
  ]]
  
  inline def fromRefinement[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: MonadThrow2C[M, E]): js.Function2[
    /* refinement */ Refinement[Any, Any], 
    /* onError */ js.Function1[/* i */ Any, E], 
    Kleisli[M, Any, E, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRefinement")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* refinement */ Refinement[Any, Any], 
    /* onError */ js.Function1[/* i */ Any, E], 
    Kleisli[M, Any, E, Any]
  ]]
  
  inline def fromStruct[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStruct")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
      ]
    ]
  ]]
  
  inline def fromSum[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: MonadThrow2C[M, E]): js.Function1[
    /* onTagError */ js.Function3[/* tag */ String, /* value */ Any, /* tags */ js.Array[String], E], 
    js.Function1[
      /* tag */ String, 
      js.Function1[
        /* members */ Record[String, Kleisli[M, Any, E, Any]], 
        Kleisli[
          M, 
          InputOf[
            M, 
            /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>] */ js.Any
          ], 
          E, 
          TypeOf[
            M, 
            /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>] */ js.Any
          ]
        ]
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSum")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onTagError */ js.Function3[/* tag */ String, /* value */ Any, /* tags */ js.Array[String], E], 
    js.Function1[
      /* tag */ String, 
      js.Function1[
        /* members */ Record[String, Kleisli[M, Any, E, Any]], 
        Kleisli[
          M, 
          InputOf[
            M, 
            /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>] */ js.Any
          ], 
          E, 
          TypeOf[
            M, 
            /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>] */ js.Any
          ]
        ]
      ]
    ]
  ]]
  
  inline def fromTuple[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onIndexError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* components */ js.Array[Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuple")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onIndexError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* components */ js.Array[Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
      ]
    ]
  ]]
  
  inline def fromType[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>} */ js.Any
      ]
    ]
  ]]
  
  inline def id[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Applicative2C[M, E]): js.Function0[Kleisli[M, Any, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Kleisli[M, Any, E, Any]]]
  
  inline def intersect[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Apply2C[M, E]): js.Function1[
    /* right */ Kleisli[M, Any, E, Any], 
    js.Function1[/* left */ Kleisli[M, Any, E, Any], Kleisli[M, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* right */ Kleisli[M, Any, E, Any], 
    js.Function1[/* left */ Kleisli[M, Any, E, Any], Kleisli[M, Any, E, Any]]
  ]]
  
  inline def `lazy`[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Bifunctor2[M]): js.Function1[
    /* onError */ js.Function2[/* id */ String, /* e */ Any, Any], 
    js.Function2[
      /* id */ String, 
      /* f */ js.Function0[Kleisli[M, Any, Any, Any]], 
      Kleisli[M, Any, Any, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onError */ js.Function2[/* id */ String, /* e */ Any, Any], 
    js.Function2[
      /* id */ String, 
      /* f */ js.Function0[Kleisli[M, Any, Any, Any]], 
      Kleisli[M, Any, Any, Any]
    ]
  ]]
  
  inline def literal[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: MonadThrow2C[M, E]): js.Function1[
    /* onError */ js.Function2[/* i */ Any, /* values */ Array[Literal], E], 
    js.Function1[
      /* values */ Array[Literal], 
      Kleisli[
        M, 
        Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: [io-ts.io-ts/lib/Schemable.Literal, ...std.ReadonlyArray<io-ts.io-ts/lib/Schemable.Literal>][number] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onError */ js.Function2[/* i */ Any, /* values */ Array[Literal], E], 
    js.Function1[
      /* values */ Array[Literal], 
      Kleisli[
        M, 
        Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: [io-ts.io-ts/lib/Schemable.Literal, ...std.ReadonlyArray<io-ts.io-ts/lib/Schemable.Literal>][number] */ js.Any
      ]
    ]
  ]]
  
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* ia */ Kleisli[F, Any, E, Any], Kleisli[F, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[/* ia */ Kleisli[F, Any, E, Any], Kleisli[F, Any, E, Any]]
  ]]
  
  inline def mapLeftWithInput[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Bifunctor2[M]): js.Function1[
    /* f */ js.Function2[/* i */ Any, /* e */ Any, Any], 
    js.Function1[/* decoder */ Kleisli[M, Any, Any, Any], Kleisli[M, Any, Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeftWithInput")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* i */ Any, /* e */ Any, Any], 
    js.Function1[/* decoder */ Kleisli[M, Any, Any, Any], Kleisli[M, Any, Any, Any]]
  ]]
  
  inline def nullable[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onError */ js.Function2[/* i */ Any, /* e */ E, E], 
    js.Function1[/* or */ Kleisli[M, Any, E, Any], Kleisli[M, Null | Any, E, Null | Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onError */ js.Function2[/* i */ Any, /* e */ E, E], 
    js.Function1[/* or */ Kleisli[M, Any, E, Any], Kleisli[M, Null | Any, E, Null | Any]]
  ]]
  
  inline def parse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function1[
    /* decode */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    js.Function1[/* from */ Kleisli[M, Any, E, Any], Kleisli[M, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* decode */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ Any
    ], 
    js.Function1[/* from */ Kleisli[M, Any, E, Any], Kleisli[M, Any, E, Any]]
  ]]
  
  inline def refine[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (MonadThrow2C[M, E]) & Bifunctor2[M]): js.Function2[
    /* refinement */ js.Function1[/* a */ Any, /* is any */ Boolean], 
    /* onError */ js.Function1[/* a */ Any, E], 
    js.Function1[/* from */ Kleisli[M, Any, E, Any], Kleisli[M, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("refine")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* refinement */ js.Function1[/* a */ Any, /* is any */ Boolean], 
    /* onError */ js.Function1[/* a */ Any, E], 
    js.Function1[/* from */ Kleisli[M, Any, E, Any], Kleisli[M, Any, E, Any]]
  ]]
  
  inline def union[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: (Alt2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onMemberError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* members */ Array[Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        InputOf[
          M, 
          /* import warning: importer.ImportType#apply Failed type conversion: [io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>, ...std.Array<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>][keyof [io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>, ...std.Array<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>]] */ js.Any
        ], 
        E, 
        TypeOf[
          M, 
          /* import warning: importer.ImportType#apply Failed type conversion: [io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>, ...std.Array<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>][keyof [io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>, ...std.Array<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>]] */ js.Any
        ]
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onMemberError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* members */ Array[Kleisli[M, Any, E, Any]], 
      Kleisli[
        M, 
        InputOf[
          M, 
          /* import warning: importer.ImportType#apply Failed type conversion: [io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>, ...std.Array<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>][keyof [io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>, ...std.Array<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>]] */ js.Any
        ], 
        E, 
        TypeOf[
          M, 
          /* import warning: importer.ImportType#apply Failed type conversion: [io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>, ...std.Array<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>][keyof [io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>, ...std.Array<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>]] */ js.Any
        ]
      ]
    ]
  ]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    KD extends io-ts.io-ts/lib/Kleisli.Kleisli<M, infer I, any, any> ? I : never
    }}}
    */
  @js.native
  trait InputOf[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, KD] extends StObject
  
  trait Kleisli[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E, A] extends StObject {
    
    def decode(i: I): Any
  }
  object Kleisli {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E, A](decode: I => Any): Kleisli[M, I, E, A] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
      __obj.asInstanceOf[Kleisli[M, I, E, A]]
    }
    
    extension [Self <: Kleisli[?, ?, ?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E, A](x: Self & (Kleisli[M, I, E, A])) {
      
      inline def setDecode(value: I => Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    KD extends io-ts.io-ts/lib/Kleisli.Kleisli<M, any, any, infer A> ? A : never
    }}}
    */
  @js.native
  trait TypeOf[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, KD] extends StObject
}

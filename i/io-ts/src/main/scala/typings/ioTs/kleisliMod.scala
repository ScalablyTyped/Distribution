package typings.ioTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt2C
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applyMod.Apply2C
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadThrowMod.MonadThrow2C
import typings.ioTs.schemableMod.Literal
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kleisliMod {
  
  @JSImport("io-ts/lib/Kleisli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alt[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](A: Alt2C[F, E]): js.Function1[
    /* that */ Lazy[Kleisli[F, js.Any, E, js.Any]], 
    js.Function1[/* me */ Kleisli[F, js.Any, E, js.Any], Kleisli[F, js.Any, E, js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(A.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* that */ Lazy[Kleisli[F, js.Any, E, js.Any]], 
    js.Function1[/* me */ Kleisli[F, js.Any, E, js.Any], Kleisli[F, js.Any, E, js.Any]]
  ]]
  
  inline def compose[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): js.Function1[
    /* ab */ Kleisli[M, js.Any, E, js.Any], 
    js.Function1[/* ia */ Kleisli[M, js.Any, E, js.Any], Kleisli[M, js.Any, E, js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ab */ Kleisli[M, js.Any, E, js.Any], 
    js.Function1[/* ia */ Kleisli[M, js.Any, E, js.Any], Kleisli[M, js.Any, E, js.Any]]
  ]]
  
  inline def fromArray[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onItemError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* item */ Kleisli[M, js.Any, E, js.Any], 
      Kleisli[M, js.Array[js.Any], E, js.Array[js.Any]]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onItemError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* item */ Kleisli[M, js.Any, E, js.Any], 
      Kleisli[M, js.Array[js.Any], E, js.Array[js.Any]]
    ]
  ]]
  
  inline def fromPartial[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, js.Any, E, js.Any]], 
      Kleisli[
        M, 
        Partial[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & (TopLevel[Record[String, Kleisli[M, js.Any, E, js.Any]]])
        ], 
        E, 
        Partial[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & (TopLevel[Record[String, Kleisli[M, js.Any, E, js.Any]]])
        ]
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartial")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, js.Any, E, js.Any]], 
      Kleisli[
        M, 
        Partial[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & (TopLevel[Record[String, Kleisli[M, js.Any, E, js.Any]]])
        ], 
        E, 
        Partial[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & (TopLevel[Record[String, Kleisli[M, js.Any, E, js.Any]]])
        ]
      ]
    ]
  ]]
  
  inline def fromRecord[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onKeyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* codomain */ Kleisli[M, js.Any, E, js.Any], 
      Kleisli[M, Record[String, js.Any], E, Record[String, js.Any]]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRecord")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onKeyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* codomain */ Kleisli[M, js.Any, E, js.Any], 
      Kleisli[M, Record[String, js.Any], E, Record[String, js.Any]]
    ]
  ]]
  
  inline def fromRefinement[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: MonadThrow2C[M, E]): js.Function2[
    /* refinement */ Refinement[js.Any, js.Any], 
    /* onError */ js.Function1[/* i */ js.Any, E], 
    Kleisli[M, js.Any, E, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRefinement")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* refinement */ Refinement[js.Any, js.Any], 
    /* onError */ js.Function1[/* i */ js.Any, E], 
    Kleisli[M, js.Any, E, js.Any]
  ]]
  
  inline def fromSum[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: MonadThrow2C[M, E]): js.Function1[
    /* onTagError */ js.Function3[/* tag */ String, /* value */ js.Any, /* tags */ js.Array[String], E], 
    js.Function1[
      /* tag */ String, 
      js.Function1[
        /* members */ Record[String, Kleisli[M, js.Any, E, js.Any]], 
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
    /* onTagError */ js.Function3[/* tag */ String, /* value */ js.Any, /* tags */ js.Array[String], E], 
    js.Function1[
      /* tag */ String, 
      js.Function1[
        /* members */ Record[String, Kleisli[M, js.Any, E, js.Any]], 
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
  
  inline def fromTuple[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onIndexError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* components */ js.Array[Kleisli[M, js.Any, E, js.Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & (TopLevel[js.Array[Kleisli[M, js.Any, E, js.Any]]]), 
        E, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & (TopLevel[js.Array[Kleisli[M, js.Any, E, js.Any]]])
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuple")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onIndexError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* components */ js.Array[Kleisli[M, js.Any, E, js.Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & (TopLevel[js.Array[Kleisli[M, js.Any, E, js.Any]]]), 
        E, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.ReadonlyArray<io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & (TopLevel[js.Array[Kleisli[M, js.Any, E, js.Any]]])
      ]
    ]
  ]]
  
  inline def fromType[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, js.Any, E, js.Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromType & (TopLevel[Record[String, Kleisli[M, js.Any, E, js.Any]]]), 
        E, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromType & (TopLevel[Record[String, Kleisli[M, js.Any, E, js.Any]]])
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onPropertyError */ js.Function2[/* key */ String, /* e */ E, E], 
    js.Function1[
      /* properties */ Record[String, Kleisli[M, js.Any, E, js.Any]], 
      Kleisli[
        M, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.InputOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromType & (TopLevel[Record[String, Kleisli[M, js.Any, E, js.Any]]]), 
        E, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>> ]: io-ts.io-ts/lib/Kleisli.TypeOf<M, std.Record<string, io-ts.io-ts/lib/Kleisli.Kleisli<M, any, E, any>>[K]>}
    */ typings.ioTs.ioTsStrings.fromType & (TopLevel[Record[String, Kleisli[M, js.Any, E, js.Any]]])
      ]
    ]
  ]]
  
  inline def id[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Applicative2C[M, E]): js.Function0[Kleisli[M, js.Any, E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Kleisli[M, js.Any, E, js.Any]]]
  
  inline def intersect[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Apply2C[M, E]): js.Function1[
    /* right */ Kleisli[M, js.Any, E, js.Any], 
    js.Function1[/* left */ Kleisli[M, js.Any, E, js.Any], Kleisli[M, js.Any, E, js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* right */ Kleisli[M, js.Any, E, js.Any], 
    js.Function1[/* left */ Kleisli[M, js.Any, E, js.Any], Kleisli[M, js.Any, E, js.Any]]
  ]]
  
  inline def `lazy`[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Bifunctor2[M]): js.Function1[
    /* onError */ js.Function2[/* id */ String, /* e */ js.Any, js.Any], 
    js.Function2[
      /* id */ String, 
      /* f */ js.Function0[Kleisli[M, js.Any, js.Any, js.Any]], 
      Kleisli[M, js.Any, js.Any, js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onError */ js.Function2[/* id */ String, /* e */ js.Any, js.Any], 
    js.Function2[
      /* id */ String, 
      /* f */ js.Function0[Kleisli[M, js.Any, js.Any, js.Any]], 
      Kleisli[M, js.Any, js.Any, js.Any]
    ]
  ]]
  
  inline def literal[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: MonadThrow2C[M, E]): js.Function1[
    /* onError */ js.Function2[/* i */ js.Any, /* values */ Array[Literal], E], 
    js.Function1[
      /* values */ Array[Literal], 
      Kleisli[
        M, 
        js.Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: [io-ts.io-ts/lib/Schemable.Literal, ...std.Array<io-ts.io-ts/lib/Schemable.Literal>][number] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onError */ js.Function2[/* i */ js.Any, /* values */ Array[Literal], E], 
    js.Function1[
      /* values */ Array[Literal], 
      Kleisli[
        M, 
        js.Any, 
        E, 
        /* import warning: importer.ImportType#apply Failed type conversion: [io-ts.io-ts/lib/Schemable.Literal, ...std.Array<io-ts.io-ts/lib/Schemable.Literal>][number] */ js.Any
      ]
    ]
  ]]
  
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Functor2C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* ia */ Kleisli[F, js.Any, E, js.Any], Kleisli[F, js.Any, E, js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* ia */ Kleisli[F, js.Any, E, js.Any], Kleisli[F, js.Any, E, js.Any]]
  ]]
  
  inline def mapLeftWithInput[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Bifunctor2[M]): js.Function1[
    /* f */ js.Function2[/* i */ js.Any, /* e */ js.Any, js.Any], 
    js.Function1[
      /* decoder */ Kleisli[M, js.Any, js.Any, js.Any], 
      Kleisli[M, js.Any, js.Any, js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeftWithInput")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* i */ js.Any, /* e */ js.Any, js.Any], 
    js.Function1[
      /* decoder */ Kleisli[M, js.Any, js.Any, js.Any], 
      Kleisli[M, js.Any, js.Any, js.Any]
    ]
  ]]
  
  inline def nullable[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: (Applicative2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onError */ js.Function2[/* i */ js.Any, /* e */ E, E], 
    js.Function1[
      /* or */ Kleisli[M, js.Any, E, js.Any], 
      Kleisli[M, Null | js.Any, E, Null | js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* onError */ js.Function2[/* i */ js.Any, /* e */ E, E], 
    js.Function1[
      /* or */ Kleisli[M, js.Any, E, js.Any], 
      Kleisli[M, Null | js.Any, E, Null | js.Any]
    ]
  ]]
  
  inline def parse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): js.Function1[
    /* decode */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    js.Function1[/* from */ Kleisli[M, js.Any, E, js.Any], Kleisli[M, js.Any, E, js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* decode */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    js.Function1[/* from */ Kleisli[M, js.Any, E, js.Any], Kleisli[M, js.Any, E, js.Any]]
  ]]
  
  inline def refine[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: (MonadThrow2C[M, E]) & Bifunctor2[M]): js.Function2[
    /* refinement */ js.Function1[/* a */ js.Any, /* is any */ Boolean], 
    /* onError */ js.Function1[/* a */ js.Any, E], 
    js.Function1[/* from */ Kleisli[M, js.Any, E, js.Any], Kleisli[M, js.Any, E, js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("refine")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* refinement */ js.Function1[/* a */ js.Any, /* is any */ Boolean], 
    /* onError */ js.Function1[/* a */ js.Any, E], 
    js.Function1[/* from */ Kleisli[M, js.Any, E, js.Any], Kleisli[M, js.Any, E, js.Any]]
  ]]
  
  inline def union[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: (Alt2C[M, E]) & Bifunctor2[M]): js.Function1[
    /* onMemberError */ js.Function2[/* index */ Double, /* e */ E, E], 
    js.Function1[
      /* members */ Array[Kleisli[M, js.Any, E, js.Any]], 
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
      /* members */ Array[Kleisli[M, js.Any, E, js.Any]], 
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
  
  type InputOf[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, KD] = js.Any
  
  trait Kleisli[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E, A] extends StObject {
    
    def decode(i: I): js.Any
  }
  object Kleisli {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E, A](decode: I => js.Any): Kleisli[M, I, E, A] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
      __obj.asInstanceOf[Kleisli[M, I, E, A]]
    }
    
    extension [Self <: Kleisli[?, ?, ?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E, A](x: Self & (Kleisli[M, I, E, A])) {
      
      inline def setDecode(value: I => js.Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  type TypeOf[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, KD] = js.Any
}

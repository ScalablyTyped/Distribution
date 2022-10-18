package typings.ioTs

import typings.fpTs.libFunctionMod.Refinement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchemableMod {
  
  @JSImport("io-ts/lib/Schemable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoize[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  
  type Literal = String | Double | Boolean | Null
  
  trait Schemable[S] extends StObject {
    
    val URI: S
    
    def array[A](
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any
    ): Any
    
    val boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, boolean> */ Any
    
    def intersect[B](
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ Any
    ): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* left */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A & B> */ Any
      ]
    
    def `lazy`[A](
      id: String,
      f: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any
        ]
    ): Any
    
    def literal[A /* <: Array[L] */, L /* <: Literal */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
    ): Any
    
    def nullable[A](
      or: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any
    ): Any
    
    val number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, number> */ Any
    
    def partial[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any
    ): Any
    
    def readonly[A](
      sa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any
    ): Any
    
    def record[A](
      codomain: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any
    ): Any
    
    val string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, string> */ Any
    
    def struct[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any
    ): Any
    
    def sum[T /* <: String */](tag: T): js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[keyof A]> */ Any
      ]
    
    def tuple[A /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: HKT<S, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any
    ): Any
    
    /** @deprecated */
    def `type`[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any
    ): Any
  }
  object Schemable {
    
    inline def apply[S](
      URI: S,
      array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any => Any,
      boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, boolean> */ Any,
      intersect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* left */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A & B> */ Any
        ],
      `lazy`: (String, js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any
        ]) => Any,
      literal: Any => Any,
      nullable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any => Any,
      number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, number> */ Any,
      partial: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any,
      readonly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any => Any,
      record: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any => Any,
      string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, string> */ Any,
      struct: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any,
      sum: Any => js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[keyof A]> */ Any
        ],
      tuple: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any
    ): Schemable[S] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], array = js.Any.fromFunction1(array), boolean = boolean.asInstanceOf[js.Any], intersect = js.Any.fromFunction1(intersect), literal = js.Any.fromFunction1(literal), nullable = js.Any.fromFunction1(nullable), number = number.asInstanceOf[js.Any], partial = js.Any.fromFunction1(partial), readonly = js.Any.fromFunction1(readonly), record = js.Any.fromFunction1(record), string = string.asInstanceOf[js.Any], struct = js.Any.fromFunction1(struct), sum = js.Any.fromFunction1(sum), tuple = js.Any.fromFunction1(tuple))
      __obj.updateDynamic("lazy")(js.Any.fromFunction2(`lazy`))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Schemable[S]]
    }
    
    extension [Self <: Schemable[?], S](x: Self & Schemable[S]) {
      
      inline def setArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any => Any
      ): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      inline def setBoolean(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, boolean> */ Any
      ): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setIntersect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ Any => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* left */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A & B> */ Any
            ]
      ): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
      
      inline def setLazy(
        value: (String, js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any
            ]) => Any
      ): Self = StObject.set(x, "lazy", js.Any.fromFunction2(value))
      
      inline def setLiteral(value: Any => Any): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
      
      inline def setNullable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any => Any
      ): Self = StObject.set(x, "nullable", js.Any.fromFunction1(value))
      
      inline def setNumber(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, number> */ Any
      ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPartial(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "partial", js.Any.fromFunction1(value))
      
      inline def setReadonly(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any => Any
      ): Self = StObject.set(x, "readonly", js.Any.fromFunction1(value))
      
      inline def setRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any => Any
      ): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
      
      inline def setString(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, string> */ Any
      ): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStruct(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "struct", js.Any.fromFunction1(value))
      
      inline def setSum(
        value: Any => js.Function1[
              /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[keyof A]> */ Any
            ]
      ): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      inline def setTuple(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "tuple", js.Any.fromFunction1(value))
      
      inline def setType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setURI(value: S): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Schemable1[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    val URI: S
    
    def array[A](
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
    ): Any
    
    val boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, boolean> */ Any
    
    def intersect[B](
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ Any
    ): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* left */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A & B> */ Any
      ]
    
    def `lazy`[A](
      id: String,
      f: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
        ]
    ): Any
    
    def literal[A /* <: Array[L] */, L /* <: Literal */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
    ): Any
    
    def nullable[A](
      or: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
    ): Any
    
    val number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, number> */ Any
    
    def partial[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any
    ): Any
    
    def readonly[A](
      sa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
    ): Any
    
    def record[A](
      codomain: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
    ): Any
    
    val string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, string> */ Any
    
    def struct[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any
    ): Any
    
    def sum[T /* <: String */](tag: T): js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[keyof A]> */ Any
      ]
    
    def tuple[A /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Kind<S, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any
    ): Any
    
    /** @deprecated */
    def `type`[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any
    ): Any
  }
  object Schemable1 {
    
    inline def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      URI: S,
      array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any => Any,
      boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, boolean> */ Any,
      intersect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* left */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A & B> */ Any
        ],
      `lazy`: (String, js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
        ]) => Any,
      literal: Any => Any,
      nullable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any => Any,
      number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, number> */ Any,
      partial: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any,
      readonly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any => Any,
      record: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any => Any,
      string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, string> */ Any,
      struct: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any,
      sum: Any => js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[keyof A]> */ Any
        ],
      tuple: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any
    ): Schemable1[S] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], array = js.Any.fromFunction1(array), boolean = boolean.asInstanceOf[js.Any], intersect = js.Any.fromFunction1(intersect), literal = js.Any.fromFunction1(literal), nullable = js.Any.fromFunction1(nullable), number = number.asInstanceOf[js.Any], partial = js.Any.fromFunction1(partial), readonly = js.Any.fromFunction1(readonly), record = js.Any.fromFunction1(record), string = string.asInstanceOf[js.Any], struct = js.Any.fromFunction1(struct), sum = js.Any.fromFunction1(sum), tuple = js.Any.fromFunction1(tuple))
      __obj.updateDynamic("lazy")(js.Any.fromFunction2(`lazy`))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Schemable1[S]]
    }
    
    extension [Self <: Schemable1[?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & Schemable1[S]) {
      
      inline def setArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any => Any
      ): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      inline def setBoolean(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, boolean> */ Any
      ): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setIntersect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ Any => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* left */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A & B> */ Any
            ]
      ): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
      
      inline def setLazy(
        value: (String, js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
            ]) => Any
      ): Self = StObject.set(x, "lazy", js.Any.fromFunction2(value))
      
      inline def setLiteral(value: Any => Any): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
      
      inline def setNullable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any => Any
      ): Self = StObject.set(x, "nullable", js.Any.fromFunction1(value))
      
      inline def setNumber(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, number> */ Any
      ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPartial(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "partial", js.Any.fromFunction1(value))
      
      inline def setReadonly(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any => Any
      ): Self = StObject.set(x, "readonly", js.Any.fromFunction1(value))
      
      inline def setRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any => Any
      ): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
      
      inline def setString(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, string> */ Any
      ): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStruct(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "struct", js.Any.fromFunction1(value))
      
      inline def setSum(
        value: Any => js.Function1[
              /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[keyof A]> */ Any
            ]
      ): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      inline def setTuple(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "tuple", js.Any.fromFunction1(value))
      
      inline def setType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setURI(value: S): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Schemable2C[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    val URI: S
    
    def array[A](
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any
    ): Any
    
    val boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, boolean> */ Any
    
    def intersect[B](
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ Any
    ): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* left */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A & B> */ Any
      ]
    
    def `lazy`[A](
      id: String,
      f: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any
        ]
    ): Any
    
    def literal[A /* <: Array[L] */, L /* <: Literal */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
    ): Any
    
    def nullable[A](
      or: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any
    ): Any
    
    val number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, number> */ Any
    
    def partial[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any
    ): Any
    
    def readonly[A](
      sa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any
    ): Any
    
    def record[A](
      codomain: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any
    ): Any
    
    val string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, string> */ Any
    
    def struct[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any
    ): Any
    
    def sum[T /* <: String */](tag: T): js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[keyof A]> */ Any
      ]
    
    def tuple[A /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Kind2<S, E, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any
    ): Any
    
    /** @deprecated */
    def `type`[A](
      properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any
    ): Any
  }
  object Schemable2C {
    
    inline def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      URI: S,
      array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any => Any,
      boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, boolean> */ Any,
      intersect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* left */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A & B> */ Any
        ],
      `lazy`: (String, js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any
        ]) => Any,
      literal: Any => Any,
      nullable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any => Any,
      number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, number> */ Any,
      partial: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any,
      readonly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any => Any,
      record: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any => Any,
      string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, string> */ Any,
      struct: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any,
      sum: Any => js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[keyof A]> */ Any
        ],
      tuple: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any
    ): Schemable2C[S, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], array = js.Any.fromFunction1(array), boolean = boolean.asInstanceOf[js.Any], intersect = js.Any.fromFunction1(intersect), literal = js.Any.fromFunction1(literal), nullable = js.Any.fromFunction1(nullable), number = number.asInstanceOf[js.Any], partial = js.Any.fromFunction1(partial), readonly = js.Any.fromFunction1(readonly), record = js.Any.fromFunction1(record), string = string.asInstanceOf[js.Any], struct = js.Any.fromFunction1(struct), sum = js.Any.fromFunction1(sum), tuple = js.Any.fromFunction1(tuple))
      __obj.updateDynamic("lazy")(js.Any.fromFunction2(`lazy`))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Schemable2C[S, E]]
    }
    
    extension [Self <: Schemable2C[?, ?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Schemable2C[S, E])) {
      
      inline def setArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any => Any
      ): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      inline def setBoolean(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, boolean> */ Any
      ): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setIntersect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ Any => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* left */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A & B> */ Any
            ]
      ): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
      
      inline def setLazy(
        value: (String, js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any
            ]) => Any
      ): Self = StObject.set(x, "lazy", js.Any.fromFunction2(value))
      
      inline def setLiteral(value: Any => Any): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
      
      inline def setNullable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any => Any
      ): Self = StObject.set(x, "nullable", js.Any.fromFunction1(value))
      
      inline def setNumber(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, number> */ Any
      ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPartial(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "partial", js.Any.fromFunction1(value))
      
      inline def setReadonly(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any => Any
      ): Self = StObject.set(x, "readonly", js.Any.fromFunction1(value))
      
      inline def setRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ Any => Any
      ): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
      
      inline def setString(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, string> */ Any
      ): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStruct(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "struct", js.Any.fromFunction1(value))
      
      inline def setSum(
        value: Any => js.Function1[
              /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K] & Record<T, K>> * / any} */ /* members */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[keyof A]> */ Any
            ]
      ): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      inline def setTuple(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "tuple", js.Any.fromFunction1(value))
      
      inline def setType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setURI(value: S): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithRefine[S] extends StObject {
    
    def refine[A, B /* <: A */](refinement: Refinement[A, B], id: String): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* from */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ Any
      ]
  }
  object WithRefine {
    
    inline def apply[S](
      refine: (Refinement[Any, Any], String) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* from */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ Any
        ]
    ): WithRefine[S] = {
      val __obj = js.Dynamic.literal(refine = js.Any.fromFunction2(refine))
      __obj.asInstanceOf[WithRefine[S]]
    }
    
    extension [Self <: WithRefine[?], S](x: Self & WithRefine[S]) {
      
      inline def setRefine(
        value: (Refinement[Any, Any], String) => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* from */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ Any
            ]
      ): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
    }
  }
  
  trait WithRefine1[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def refine[A, B /* <: A */](refinement: Refinement[A, B], id: String): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* from */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ Any
      ]
  }
  object WithRefine1 {
    
    inline def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      refine: (Refinement[Any, Any], String) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* from */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ Any
        ]
    ): WithRefine1[S] = {
      val __obj = js.Dynamic.literal(refine = js.Any.fromFunction2(refine))
      __obj.asInstanceOf[WithRefine1[S]]
    }
    
    extension [Self <: WithRefine1[?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & WithRefine1[S]) {
      
      inline def setRefine(
        value: (Refinement[Any, Any], String) => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* from */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ Any
            ]
      ): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
    }
  }
  
  trait WithRefine2C[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def refine[A, B /* <: A */](refinement: Refinement[A, B], id: String): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* from */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ Any
      ]
  }
  object WithRefine2C {
    
    inline def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      refine: (Refinement[Any, Any], String) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* from */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ Any
        ]
    ): WithRefine2C[S, E] = {
      val __obj = js.Dynamic.literal(refine = js.Any.fromFunction2(refine))
      __obj.asInstanceOf[WithRefine2C[S, E]]
    }
    
    extension [Self <: WithRefine2C[?, ?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (WithRefine2C[S, E])) {
      
      inline def setRefine(
        value: (Refinement[Any, Any], String) => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* from */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ Any
            ]
      ): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
    }
  }
  
  trait WithUnion[S] extends StObject {
    
    def union[A /* <: Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: HKT<S, A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any
    ): Any
  }
  object WithUnion {
    
    inline def apply[S](
      union: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any
    ): WithUnion[S] = {
      val __obj = js.Dynamic.literal(union = js.Any.fromFunction1(union))
      __obj.asInstanceOf[WithUnion[S]]
    }
    
    extension [Self <: WithUnion[?], S](x: Self & WithUnion[S]) {
      
      inline def setUnion(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    }
  }
  
  trait WithUnion1[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def union[A /* <: Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: Kind<S, A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any
    ): Any
  }
  object WithUnion1 {
    
    inline def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      union: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any
    ): WithUnion1[S] = {
      val __obj = js.Dynamic.literal(union = js.Any.fromFunction1(union))
      __obj.asInstanceOf[WithUnion1[S]]
    }
    
    extension [Self <: WithUnion1[?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & WithUnion1[S]) {
      
      inline def setUnion(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    }
  }
  
  trait WithUnion2C[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def union[A /* <: Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: Kind2<S, E, A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any
    ): Any
  }
  object WithUnion2C {
    
    inline def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      union: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any
    ): WithUnion2C[S, E] = {
      val __obj = js.Dynamic.literal(union = js.Any.fromFunction1(union))
      __obj.asInstanceOf[WithUnion2C[S, E]]
    }
    
    extension [Self <: WithUnion2C[?, ?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (WithUnion2C[S, E])) {
      
      inline def setUnion(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any} */ js.Any => Any
      ): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    }
  }
  
  trait WithUnknownContainers[S] extends StObject {
    
    val UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Array<unknown>> */ Any
    
    val UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Record<string, unknown>> */ Any
  }
  object WithUnknownContainers {
    
    inline def apply[S](
      UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Array<unknown>> */ Any,
      UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Record<string, unknown>> */ Any
    ): WithUnknownContainers[S] = {
      val __obj = js.Dynamic.literal(UnknownArray = UnknownArray.asInstanceOf[js.Any], UnknownRecord = UnknownRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithUnknownContainers[S]]
    }
    
    extension [Self <: WithUnknownContainers[?], S](x: Self & WithUnknownContainers[S]) {
      
      inline def setUnknownArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Array<unknown>> */ Any
      ): Self = StObject.set(x, "UnknownArray", value.asInstanceOf[js.Any])
      
      inline def setUnknownRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Record<string, unknown>> */ Any
      ): Self = StObject.set(x, "UnknownRecord", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithUnknownContainers1[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    val UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Array<unknown>> */ Any
    
    val UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Record<string, unknown>> */ Any
  }
  object WithUnknownContainers1 {
    
    inline def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Array<unknown>> */ Any,
      UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Record<string, unknown>> */ Any
    ): WithUnknownContainers1[S] = {
      val __obj = js.Dynamic.literal(UnknownArray = UnknownArray.asInstanceOf[js.Any], UnknownRecord = UnknownRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithUnknownContainers1[S]]
    }
    
    extension [Self <: WithUnknownContainers1[?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & WithUnknownContainers1[S]) {
      
      inline def setUnknownArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Array<unknown>> */ Any
      ): Self = StObject.set(x, "UnknownArray", value.asInstanceOf[js.Any])
      
      inline def setUnknownRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Record<string, unknown>> */ Any
      ): Self = StObject.set(x, "UnknownRecord", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithUnknownContainers2C[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    val UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Array<unknown>> */ Any
    
    val UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Record<string, unknown>> */ Any
  }
  object WithUnknownContainers2C {
    
    inline def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Array<unknown>> */ Any,
      UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Record<string, unknown>> */ Any
    ): WithUnknownContainers2C[S, E] = {
      val __obj = js.Dynamic.literal(UnknownArray = UnknownArray.asInstanceOf[js.Any], UnknownRecord = UnknownRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithUnknownContainers2C[S, E]]
    }
    
    extension [Self <: WithUnknownContainers2C[?, ?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (WithUnknownContainers2C[S, E])) {
      
      inline def setUnknownArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Array<unknown>> */ Any
      ): Self = StObject.set(x, "UnknownArray", value.asInstanceOf[js.Any])
      
      inline def setUnknownRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Record<string, unknown>> */ Any
      ): Self = StObject.set(x, "UnknownRecord", value.asInstanceOf[js.Any])
    }
  }
}

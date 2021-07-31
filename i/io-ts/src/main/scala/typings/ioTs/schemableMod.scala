package typings.ioTs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemableMod {
  
  @JSImport("io-ts/lib/Schemable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def memoize[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  
  type Literal = String | Double | Boolean | Null
  
  trait Schemable[S] extends StObject {
    
    val URI: S
    
    def array[A](
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any
    ): js.Any
    
    val boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, boolean> */ js.Any
    
    def intersect[B](
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ js.Any
    ): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* left */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A & B> */ js.Any
      ]
    
    def `lazy`[A](
      id: String,
      f: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any
        ]
    ): js.Any
    
    def literal[A /* <: Array[Literal] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
    ): js.Any
    
    def nullable[A](
      or: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any
    ): js.Any
    
    val number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, number> */ js.Any
    
    def partial[A](
      properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any]
    ): js.Any
    
    def record[A](
      codomain: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any
    ): js.Any
    
    val string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, string> */ js.Any
    
    def sum[T /* <: String */](tag: T): js.Function1[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K] & Record<T, K>> * / any}
      */ /* members */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[keyof A]> */ js.Any
      ]
    
    def tuple[A /* <: js.Array[js.Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: HKT<S, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any]
    ): js.Any
    
    def `type`[A](
      properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any]
    ): js.Any
  }
  object Schemable {
    
    @scala.inline
    def apply[S](
      URI: S,
      array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any => js.Any,
      boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, boolean> */ js.Any,
      intersect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ js.Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* left */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A & B> */ js.Any
        ],
      `lazy`: (String, js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any
        ]) => js.Any,
      literal: js.Any => js.Any,
      nullable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any => js.Any,
      number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, number> */ js.Any,
      partial: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any] => js.Any,
      record: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any => js.Any,
      string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, string> */ js.Any,
      sum: js.Any => js.Function1[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K] & Record<T, K>> * / any}
      */ /* members */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[keyof A]> */ js.Any
        ],
      tuple: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any] => js.Any,
      `type`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any] => js.Any
    ): Schemable[S] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], array = js.Any.fromFunction1(array), boolean = boolean.asInstanceOf[js.Any], intersect = js.Any.fromFunction1(intersect), literal = js.Any.fromFunction1(literal), nullable = js.Any.fromFunction1(nullable), number = number.asInstanceOf[js.Any], partial = js.Any.fromFunction1(partial), record = js.Any.fromFunction1(record), string = string.asInstanceOf[js.Any], sum = js.Any.fromFunction1(sum), tuple = js.Any.fromFunction1(tuple))
      __obj.updateDynamic("lazy")(js.Any.fromFunction2(`lazy`))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Schemable[S]]
    }
    
    @scala.inline
    implicit class SchemableMutableBuilder[Self <: Schemable[?], S] (val x: Self & Schemable[S]) extends AnyVal {
      
      @scala.inline
      def setArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoolean(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, boolean> */ js.Any
      ): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ js.Any => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* left */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A & B> */ js.Any
            ]
      ): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLazy(
        value: (String, js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "lazy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLiteral(value: js.Any => js.Any): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNullable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "nullable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumber(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, number> */ js.Any
      ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartial(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "partial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
      
      @scala.inline
      def setString(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, string> */ js.Any
      ): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSum(
        value: js.Any => js.Function1[
              /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K] & Record<T, K>> * / any}
        */ /* members */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[keyof A]> */ js.Any
            ]
      ): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTuple(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "tuple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      @scala.inline
      def setURI(value: S): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Schemable1[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    val URI: S
    
    def array[A](
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
    ): js.Any
    
    val boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, boolean> */ js.Any
    
    def intersect[B](
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ js.Any
    ): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* left */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A & B> */ js.Any
      ]
    
    def `lazy`[A](
      id: String,
      f: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
        ]
    ): js.Any
    
    def literal[A /* <: Array[Literal] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
    ): js.Any
    
    def nullable[A](
      or: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
    ): js.Any
    
    val number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, number> */ js.Any
    
    def partial[A](
      properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any]
    ): js.Any
    
    def record[A](
      codomain: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
    ): js.Any
    
    val string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, string> */ js.Any
    
    def sum[T /* <: String */](tag: T): js.Function1[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K] & Record<T, K>> * / any}
      */ /* members */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[keyof A]> */ js.Any
      ]
    
    def tuple[A /* <: js.Array[js.Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Kind<S, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any]
    ): js.Any
    
    def `type`[A](
      properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any]
    ): js.Any
  }
  object Schemable1 {
    
    @scala.inline
    def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: S,
      array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any,
      boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, boolean> */ js.Any,
      intersect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ js.Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* left */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A & B> */ js.Any
        ],
      `lazy`: (String, js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
        ]) => js.Any,
      literal: js.Any => js.Any,
      nullable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any,
      number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, number> */ js.Any,
      partial: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any] => js.Any,
      record: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any,
      string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, string> */ js.Any,
      sum: js.Any => js.Function1[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K] & Record<T, K>> * / any}
      */ /* members */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[keyof A]> */ js.Any
        ],
      tuple: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any] => js.Any,
      `type`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any] => js.Any
    ): Schemable1[S] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], array = js.Any.fromFunction1(array), boolean = boolean.asInstanceOf[js.Any], intersect = js.Any.fromFunction1(intersect), literal = js.Any.fromFunction1(literal), nullable = js.Any.fromFunction1(nullable), number = number.asInstanceOf[js.Any], partial = js.Any.fromFunction1(partial), record = js.Any.fromFunction1(record), string = string.asInstanceOf[js.Any], sum = js.Any.fromFunction1(sum), tuple = js.Any.fromFunction1(tuple))
      __obj.updateDynamic("lazy")(js.Any.fromFunction2(`lazy`))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Schemable1[S]]
    }
    
    @scala.inline
    implicit class Schemable1MutableBuilder[Self <: Schemable1[?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & Schemable1[S]) extends AnyVal {
      
      @scala.inline
      def setArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoolean(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, boolean> */ js.Any
      ): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ js.Any => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* left */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A & B> */ js.Any
            ]
      ): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLazy(
        value: (String, js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "lazy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLiteral(value: js.Any => js.Any): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNullable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "nullable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumber(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, number> */ js.Any
      ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartial(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "partial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
      
      @scala.inline
      def setString(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, string> */ js.Any
      ): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSum(
        value: js.Any => js.Function1[
              /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K] & Record<T, K>> * / any}
        */ /* members */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[keyof A]> */ js.Any
            ]
      ): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTuple(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "tuple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable1 & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      @scala.inline
      def setURI(value: S): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Schemable2C[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    val URI: S
    
    def array[A](
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any
    ): js.Any
    
    val boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, boolean> */ js.Any
    
    def intersect[B](
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ js.Any
    ): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* left */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A & B> */ js.Any
      ]
    
    def `lazy`[A](
      id: String,
      f: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any
        ]
    ): js.Any
    
    def literal[A /* <: Array[Literal] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
    ): js.Any
    
    def nullable[A](
      or: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any
    ): js.Any
    
    val number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, number> */ js.Any
    
    def partial[A](
      properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any]
    ): js.Any
    
    def record[A](
      codomain: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any
    ): js.Any
    
    val string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, string> */ js.Any
    
    def sum[T /* <: String */](tag: T): js.Function1[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K] & Record<T, K>> * / any}
      */ /* members */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[keyof A]> */ js.Any
      ]
    
    def tuple[A /* <: js.Array[js.Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Kind2<S, E, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any]
    ): js.Any
    
    def `type`[A](
      properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any]
    ): js.Any
  }
  object Schemable2C {
    
    @scala.inline
    def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: S,
      array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any => js.Any,
      boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, boolean> */ js.Any,
      intersect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ js.Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* left */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A & B> */ js.Any
        ],
      `lazy`: (String, js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any
        ]) => js.Any,
      literal: js.Any => js.Any,
      nullable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any => js.Any,
      number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, number> */ js.Any,
      partial: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any] => js.Any,
      record: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any => js.Any,
      string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, string> */ js.Any,
      sum: js.Any => js.Function1[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K] & Record<T, K>> * / any}
      */ /* members */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[keyof A]> */ js.Any
        ],
      tuple: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any] => js.Any,
      `type`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any] => js.Any
    ): Schemable2C[S, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], array = js.Any.fromFunction1(array), boolean = boolean.asInstanceOf[js.Any], intersect = js.Any.fromFunction1(intersect), literal = js.Any.fromFunction1(literal), nullable = js.Any.fromFunction1(nullable), number = number.asInstanceOf[js.Any], partial = js.Any.fromFunction1(partial), record = js.Any.fromFunction1(record), string = string.asInstanceOf[js.Any], sum = js.Any.fromFunction1(sum), tuple = js.Any.fromFunction1(tuple))
      __obj.updateDynamic("lazy")(js.Any.fromFunction2(`lazy`))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Schemable2C[S, E]]
    }
    
    @scala.inline
    implicit class Schemable2CMutableBuilder[Self <: Schemable2C[?, ?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Schemable2C[S, E])) extends AnyVal {
      
      @scala.inline
      def setArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoolean(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, boolean> */ js.Any
      ): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ js.Any => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* left */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A & B> */ js.Any
            ]
      ): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLazy(
        value: (String, js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "lazy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLiteral(value: js.Any => js.Any): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNullable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "nullable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumber(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, number> */ js.Any
      ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartial(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "partial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ js.Any => js.Any
      ): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
      
      @scala.inline
      def setString(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, string> */ js.Any
      ): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSum(
        value: js.Any => js.Function1[
              /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K] & Record<T, K>> * / any}
        */ /* members */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[keyof A]> */ js.Any
            ]
      ): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTuple(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "tuple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.Schemable2C & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      @scala.inline
      def setURI(value: S): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithRefine[S] extends StObject {
    
    def refine[A, B /* <: A */](refinement: js.Function1[/* a */ A, /* is B */ Boolean], id: String): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* from */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ js.Any
      ]
  }
  object WithRefine {
    
    @scala.inline
    def apply[S](
      refine: (js.Function1[js.Any, /* is B */ Boolean], String) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* from */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ js.Any
        ]
    ): WithRefine[S] = {
      val __obj = js.Dynamic.literal(refine = js.Any.fromFunction2(refine))
      __obj.asInstanceOf[WithRefine[S]]
    }
    
    @scala.inline
    implicit class WithRefineMutableBuilder[Self <: WithRefine[?], S] (val x: Self & WithRefine[S]) extends AnyVal {
      
      @scala.inline
      def setRefine(
        value: (js.Function1[js.Any, /* is B */ Boolean], String) => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ /* from */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, B> */ js.Any
            ]
      ): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
    }
  }
  
  trait WithRefine1[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def refine[A, B /* <: A */](refinement: js.Function1[/* a */ A, /* is B */ Boolean], id: String): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* from */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ js.Any
      ]
  }
  object WithRefine1 {
    
    @scala.inline
    def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      refine: (js.Function1[js.Any, /* is B */ Boolean], String) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* from */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ js.Any
        ]
    ): WithRefine1[S] = {
      val __obj = js.Dynamic.literal(refine = js.Any.fromFunction2(refine))
      __obj.asInstanceOf[WithRefine1[S]]
    }
    
    @scala.inline
    implicit class WithRefine1MutableBuilder[Self <: WithRefine1[?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & WithRefine1[S]) extends AnyVal {
      
      @scala.inline
      def setRefine(
        value: (js.Function1[js.Any, /* is B */ Boolean], String) => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ /* from */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ js.Any
            ]
      ): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
    }
  }
  
  trait WithRefine2C[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def refine[A, B /* <: A */](refinement: js.Function1[/* a */ A, /* is B */ Boolean], id: String): js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* from */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ js.Any
      ]
  }
  object WithRefine2C {
    
    @scala.inline
    def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      refine: (js.Function1[js.Any, /* is B */ Boolean], String) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* from */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ js.Any
        ]
    ): WithRefine2C[S, E] = {
      val __obj = js.Dynamic.literal(refine = js.Any.fromFunction2(refine))
      __obj.asInstanceOf[WithRefine2C[S, E]]
    }
    
    @scala.inline
    implicit class WithRefine2CMutableBuilder[Self <: WithRefine2C[?, ?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (WithRefine2C[S, E])) extends AnyVal {
      
      @scala.inline
      def setRefine(
        value: (js.Function1[js.Any, /* is B */ Boolean], String) => js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A> */ /* from */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, B> */ js.Any
            ]
      ): Self = StObject.set(x, "refine", js.Any.fromFunction2(value))
    }
  }
  
  trait WithUnion[S] extends StObject {
    
    def union[A /* <: Array[js.Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: HKT<S, A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.WithUnion & TopLevel[js.Any]
    ): js.Any
  }
  object WithUnion {
    
    @scala.inline
    def apply[S](
      union: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.WithUnion & TopLevel[js.Any] => js.Any
    ): WithUnion[S] = {
      val __obj = js.Dynamic.literal(union = js.Any.fromFunction1(union))
      __obj.asInstanceOf[WithUnion[S]]
    }
    
    @scala.inline
    implicit class WithUnionMutableBuilder[Self <: WithUnion[?], S] (val x: Self & WithUnion[S]) extends AnyVal {
      
      @scala.inline
      def setUnion(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.WithUnion & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    }
  }
  
  trait WithUnion1[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def union[A /* <: Array[js.Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: Kind<S, A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.WithUnion1 & TopLevel[js.Any]
    ): js.Any
  }
  object WithUnion1 {
    
    @scala.inline
    def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      union: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.WithUnion1 & TopLevel[js.Any] => js.Any
    ): WithUnion1[S] = {
      val __obj = js.Dynamic.literal(union = js.Any.fromFunction1(union))
      __obj.asInstanceOf[WithUnion1[S]]
    }
    
    @scala.inline
    implicit class WithUnion1MutableBuilder[Self <: WithUnion1[?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & WithUnion1[S]) extends AnyVal {
      
      @scala.inline
      def setUnion(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.WithUnion1 & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    }
  }
  
  trait WithUnion2C[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    def union[A /* <: Array[js.Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: Kind2<S, E, A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.WithUnion2C & TopLevel[js.Any]
    ): js.Any
  }
  object WithUnion2C {
    
    @scala.inline
    def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      union: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
      */ typings.ioTs.ioTsStrings.WithUnion2C & TopLevel[js.Any] => js.Any
    ): WithUnion2C[S, E] = {
      val __obj = js.Dynamic.literal(union = js.Any.fromFunction1(union))
      __obj.asInstanceOf[WithUnion2C[S, E]]
    }
    
    @scala.inline
    implicit class WithUnion2CMutableBuilder[Self <: WithUnion2C[?, ?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (WithUnion2C[S, E])) extends AnyVal {
      
      @scala.inline
      def setUnion(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, A[K]> * / any}
        */ typings.ioTs.ioTsStrings.WithUnion2C & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    }
  }
  
  trait WithUnknownContainers[S] extends StObject {
    
    val UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Array<unknown>> */ js.Any
    
    val UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Record<string, unknown>> */ js.Any
  }
  object WithUnknownContainers {
    
    @scala.inline
    def apply[S](
      UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Array<unknown>> */ js.Any,
      UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Record<string, unknown>> */ js.Any
    ): WithUnknownContainers[S] = {
      val __obj = js.Dynamic.literal(UnknownArray = UnknownArray.asInstanceOf[js.Any], UnknownRecord = UnknownRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithUnknownContainers[S]]
    }
    
    @scala.inline
    implicit class WithUnknownContainersMutableBuilder[Self <: WithUnknownContainers[?], S] (val x: Self & WithUnknownContainers[S]) extends AnyVal {
      
      @scala.inline
      def setUnknownArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Array<unknown>> */ js.Any
      ): Self = StObject.set(x, "UnknownArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, Record<string, unknown>> */ js.Any
      ): Self = StObject.set(x, "UnknownRecord", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithUnknownContainers1[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    val UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Array<unknown>> */ js.Any
    
    val UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Record<string, unknown>> */ js.Any
  }
  object WithUnknownContainers1 {
    
    @scala.inline
    def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Array<unknown>> */ js.Any,
      UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Record<string, unknown>> */ js.Any
    ): WithUnknownContainers1[S] = {
      val __obj = js.Dynamic.literal(UnknownArray = UnknownArray.asInstanceOf[js.Any], UnknownRecord = UnknownRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithUnknownContainers1[S]]
    }
    
    @scala.inline
    implicit class WithUnknownContainers1MutableBuilder[Self <: WithUnknownContainers1[?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & WithUnknownContainers1[S]) extends AnyVal {
      
      @scala.inline
      def setUnknownArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Array<unknown>> */ js.Any
      ): Self = StObject.set(x, "UnknownArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Record<string, unknown>> */ js.Any
      ): Self = StObject.set(x, "UnknownRecord", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithUnknownContainers2C[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
    
    val UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Array<unknown>> */ js.Any
    
    val UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Record<string, unknown>> */ js.Any
  }
  object WithUnknownContainers2C {
    
    @scala.inline
    def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Array<unknown>> */ js.Any,
      UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Record<string, unknown>> */ js.Any
    ): WithUnknownContainers2C[S, E] = {
      val __obj = js.Dynamic.literal(UnknownArray = UnknownArray.asInstanceOf[js.Any], UnknownRecord = UnknownRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithUnknownContainers2C[S, E]]
    }
    
    @scala.inline
    implicit class WithUnknownContainers2CMutableBuilder[Self <: WithUnknownContainers2C[?, ?], S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (WithUnknownContainers2C[S, E])) extends AnyVal {
      
      @scala.inline
      def setUnknownArray(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Array<unknown>> */ js.Any
      ): Self = StObject.set(x, "UnknownArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownRecord(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, E, Record<string, unknown>> */ js.Any
      ): Self = StObject.set(x, "UnknownRecord", value.asInstanceOf[js.Any])
    }
  }
}

package typings.ioTs.schemableMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schemable[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends js.Object {
  val URI: S
  val UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Array<unknown>> */ js.Any
  val UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Record<string, unknown>> */ js.Any
  val boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, boolean> */ js.Any
  val number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, number> */ js.Any
  val string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, string> */ js.Any
  def array[A](
    items: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
  ): js.Any
  def intersection[A, B](
    left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any,
    right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ js.Any
  ): js.Any
  def `lazy`[A](
    id: String,
    f: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ _
    ]
  ): js.Any
  def literal[A /* <: js.Array[Literal] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): js.Any
  def nullable[A](
    or: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
  ): js.Any
  def partial[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
    */ typings.ioTs.ioTsStrings.Schemable with TopLevel[js.Any]
  ): js.Any
  def record[A](
    codomain: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
  ): js.Any
  def sum[T /* <: String */](tag: T): js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K] & Record<T, K>> * / any}
    */ /* members */ typings.ioTs.ioTsStrings.Schemable with TopLevel[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[keyof A]> */ _
  ]
  def tuple[A /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Kind<S, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
    */ typings.ioTs.ioTsStrings.Schemable with TopLevel[js.Any]
  ): js.Any
  def `type`[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
    */ typings.ioTs.ioTsStrings.Schemable with TopLevel[js.Any]
  ): js.Any
}

object Schemable {
  @scala.inline
  def apply[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
    URI: S,
    UnknownArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Array<unknown>> */ js.Any,
    UnknownRecord: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, Record<string, unknown>> */ js.Any,
    array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any,
    boolean: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, boolean> */ js.Any,
    intersection: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, B> */ js.Any) => js.Any,
    `lazy`: (String, js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ _
    ]) => js.Any,
    literal: js.Any => js.Any,
    nullable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any,
    number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, number> */ js.Any,
    partial: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
    */ typings.ioTs.ioTsStrings.Schemable with TopLevel[js.Any] => js.Any,
    record: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any => js.Any,
    string: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, string> */ js.Any,
    sum: js.Any => js.Function1[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K] & Record<T, K>> * / any}
    */ /* members */ typings.ioTs.ioTsStrings.Schemable with TopLevel[js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[keyof A]> */ _
    ],
    tuple: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
    */ typings.ioTs.ioTsStrings.Schemable with TopLevel[js.Any] => js.Any,
    `type`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A[K]> * / any}
    */ typings.ioTs.ioTsStrings.Schemable with TopLevel[js.Any] => js.Any
  ): Schemable[S] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], UnknownArray = UnknownArray.asInstanceOf[js.Any], UnknownRecord = UnknownRecord.asInstanceOf[js.Any], array = js.Any.fromFunction1(array), boolean = boolean.asInstanceOf[js.Any], intersection = js.Any.fromFunction2(intersection), literal = js.Any.fromFunction1(literal), nullable = js.Any.fromFunction1(nullable), number = number.asInstanceOf[js.Any], partial = js.Any.fromFunction1(partial), record = js.Any.fromFunction1(record), string = string.asInstanceOf[js.Any], sum = js.Any.fromFunction1(sum), tuple = js.Any.fromFunction1(tuple))
    __obj.updateDynamic("lazy")(js.Any.fromFunction2(`lazy`))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Schemable[S]]
  }
}


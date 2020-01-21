package typings.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowdbFpAsync[SchemaT] extends LowdbBase[SchemaT] {
  /**
    * @description Returns a function that allows you to access/modify the database at a given path.
    * @example
    * ```js
    *  const posts = db('posts')
    *  const firstPost = posts(all => all[0])
    *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
    * ```
    */
  def apply[TKey /* <: String */](path: TKey): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */](
    path: TKey,
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
  ): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
  ] = js.native
  def apply[T](path: String): FpReturnAsync[T] = js.native
  def apply[T](path: String, defaultValue: T): FpReturnAsync[T] = js.native
  def apply[TKey /* <: String */](path: js.Array[TKey]): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
  ] = js.native
  def apply[T](path: js.Array[String], defaultValue: T): FpReturnAsync[T] = js.native
  def apply[TKey /* <: String */](
    path: js.Array[TKey],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
  ): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */](path: js.Tuple2[TKey, TSubKey]): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */](
    path: js.Tuple2[TKey, TSubKey],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
  ): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */](path: js.Tuple3[TKey, TSubKey, TSubKey2]): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */](
    path: js.Tuple3[TKey, TSubKey, TSubKey2],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
  ): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */](path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3]): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */](
    path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
  ): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */, TSubKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any */](path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4]): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
  ] = js.native
  def apply[TKey /* <: String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */, TSubKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any */](
    path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
  ): FpReturnAsync[
    /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
  ] = js.native
  /**
    * @description Be careful: This function overwrites the whole database.
    */
  def write[T](): js.Promise[T] = js.native
  def write[T](returnValue: T): js.Promise[T] = js.native
}


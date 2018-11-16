package typings
package lowdbLib.lowdbMod.LowdbNs

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
  def apply[TKey /* <: java.lang.String */](path: TKey): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  /**
       * @description Returns a function that allows you to access/modify the database at a given path.
       * @example
       * ```js
       *  const posts = db('posts')
       *  const firstPost = posts(all => all[0])
       *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
       * ```
       */
  def apply[TKey /* <: java.lang.String */](
    path: TKey,
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def apply[T](path: java.lang.String): FpReturnAsync[T] = js.native
  def apply[T](path: java.lang.String, defaultValue: T): FpReturnAsync[T] = js.native
  def apply[T](path: js.Array[java.lang.String]): FpReturnAsync[T] = js.native
  def apply[T](path: js.Array[java.lang.String], defaultValue: T): FpReturnAsync[T] = js.native
  /**
       * @description Returns a function that allows you to access/modify the database at a given path.
       * @example
       * ```js
       *  const posts = db('posts')
       *  const firstPost = posts(all => all[0])
       *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
       * ```
       */
  def apply[TKey /* <: java.lang.String */](
    path: js.Array[TKey],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */](path: js.Tuple2[TKey, TSubKey]): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */](
    path: js.Tuple2[TKey, TSubKey],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))) */js.Any
  ): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */](path: js.Tuple3[TKey, TSubKey, TSubKey2]): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */](
    path: js.Tuple3[TKey, TSubKey, TSubKey2],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))) */js.Any
  ): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */, TSubKey3 /* <: java.lang.String */](path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3]): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */, TSubKey3 /* <: java.lang.String */](
    path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))) */js.Any
  ): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */, TSubKey3 /* <: java.lang.String */, TSubKey4 /* <: java.lang.String */](path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4]): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))),Left(TsIdentSimple(TSubKey4))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */, TSubKey3 /* <: java.lang.String */, TSubKey4 /* <: java.lang.String */](
    path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))),Left(TsIdentSimple(TSubKey4))) */js.Any
  ): FpReturnAsync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))),Left(TsIdentSimple(TSubKey4))) */js.Any
  ] = js.native
  /**
       * @description Be careful: This function overwrites the whole database.
       */
  def write[T](): stdLib.Promise[T] = js.native
  /**
       * @description Be careful: This function overwrites the whole database.
       */
  def write[T](returnValue: T): stdLib.Promise[T] = js.native
}


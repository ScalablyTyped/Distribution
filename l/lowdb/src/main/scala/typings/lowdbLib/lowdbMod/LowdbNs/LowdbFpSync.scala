package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowdbFpSync[SchemaT] extends LowdbBase[SchemaT] {
  /**
       * @description Returns a function that allows you to access/modify the database at a given path.
       * @example
       * ```js
       *  const posts = db('posts')
       *  const firstPost = posts(all => all[0])
       *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
       * ```
       */
  def apply[TKey /* <: java.lang.String */](path: TKey): FpReturnSync[
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
  ): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def apply[T](path: java.lang.String): FpReturnSync[T] = js.native
  def apply[T](path: java.lang.String, defaultValue: T): FpReturnSync[T] = js.native
  /**
       * @description Returns a function that allows you to access/modify the database at a given path.
       * @example
       * ```js
       *  const posts = db('posts')
       *  const firstPost = posts(all => all[0])
       *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
       * ```
       */
  def apply[TKey /* <: java.lang.String */](path: js.Array[TKey]): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def apply[T](path: js.Array[java.lang.String], defaultValue: T): FpReturnSync[T] = js.native
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
  ): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */](path: js.Tuple2[TKey, TSubKey]): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */](
    path: js.Tuple2[TKey, TSubKey],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))) */js.Any
  ): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */](path: js.Tuple3[TKey, TSubKey, TSubKey2]): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */](
    path: js.Tuple3[TKey, TSubKey, TSubKey2],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))) */js.Any
  ): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */, TSubKey3 /* <: java.lang.String */](path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3]): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */, TSubKey3 /* <: java.lang.String */](
    path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))) */js.Any
  ): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */, TSubKey3 /* <: java.lang.String */, TSubKey4 /* <: java.lang.String */](path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4]): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))),Left(TsIdentSimple(TSubKey4))) */js.Any
  ] = js.native
  def apply[TKey /* <: java.lang.String */, TSubKey /* <: java.lang.String */, TSubKey2 /* <: java.lang.String */, TSubKey3 /* <: java.lang.String */, TSubKey4 /* <: java.lang.String */](
    path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))),Left(TsIdentSimple(TSubKey4))) */js.Any
  ): FpReturnSync[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(SchemaT))),List()),Left(TsIdentSimple(TKey))),Left(TsIdentSimple(TSubKey))),Left(TsIdentSimple(TSubKey2))),Left(TsIdentSimple(TSubKey3))),Left(TsIdentSimple(TSubKey4))) */js.Any
  ] = js.native
  /**
       * @description Be careful: This function overwrites the whole database.
       */
  def write[T](): T = js.native
  /**
       * @description Be careful: This function overwrites the whole database.
       */
  def write[T](returnValue: T): T = js.native
}


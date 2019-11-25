package typings.handsontable.handsontableMod.Handsontable.Hooks

import typings.handsontable.handsontableMod.Handsontable
import typings.handsontable.handsontableMod.Handsontable.Bucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def add[K /* <: String */](
    key: K,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): Methods = js.native
  def add[K /* <: String */](
    key: K,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any,
    context: Handsontable
  ): Methods = js.native
  def add[K /* <: String */](
    key: K,
    callback: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ]
  ): Methods = js.native
  def add[K /* <: String */](
    key: K,
    callback: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ],
    context: Handsontable
  ): Methods = js.native
  def createEmptyBucket(): Bucket = js.native
  def deregister(key: String): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(context: Handsontable): Unit = js.native
  def getBucket(): Bucket = js.native
  def getBucket(context: Handsontable): Bucket = js.native
  def getRegistered(): js.Array[String] = js.native
  def has(key: String): Boolean = js.native
  def has(key: String, context: Handsontable): Boolean = js.native
  def isRegistered(key: String): Boolean = js.native
  def once[K /* <: String */](
    key: K,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): Unit = js.native
  def once[K /* <: String */](
    key: K,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any,
    context: Handsontable
  ): Unit = js.native
  def once[K /* <: String */](
    key: K,
    callback: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ]
  ): Unit = js.native
  def once[K /* <: String */](
    key: K,
    callback: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ],
    context: Handsontable
  ): Unit = js.native
  def register(key: String): Unit = js.native
  def remove(key: String, callback: js.Function): Boolean = js.native
  def remove(key: String, callback: js.Function, context: Handsontable): Boolean = js.native
  def run(
    context: Handsontable,
    key: String,
    p1: js.UndefOr[js.Any],
    p2: js.UndefOr[js.Any],
    p3: js.UndefOr[js.Any],
    p4: js.UndefOr[js.Any],
    p5: js.UndefOr[js.Any],
    p6: js.UndefOr[js.Any]
  ): js.Any = js.native
}


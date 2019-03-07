package typings
package handsontableLib.handsontableMod.HandsontableNs.HooksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def add[K /* <: java.lang.String */](
    key: K,
    callback: /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): Methods = js.native
  def add[K /* <: java.lang.String */](
    key: K,
    callback: /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any,
    context: handsontableLib.handsontableMod.Handsontable
  ): Methods = js.native
  def add[K /* <: java.lang.String */](
    key: K,
    callback: js.Array[
      /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ]
  ): Methods = js.native
  def add[K /* <: java.lang.String */](
    key: K,
    callback: js.Array[
      /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ],
    context: handsontableLib.handsontableMod.Handsontable
  ): Methods = js.native
  def createEmptyBucket(): handsontableLib.handsontableMod.HandsontableNs.Bucket = js.native
  def deregister(key: java.lang.String): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(context: handsontableLib.handsontableMod.Handsontable): scala.Unit = js.native
  def getBucket(): handsontableLib.handsontableMod.HandsontableNs.Bucket = js.native
  def getBucket(context: handsontableLib.handsontableMod.Handsontable): handsontableLib.handsontableMod.HandsontableNs.Bucket = js.native
  def getRegistered(): js.Array[java.lang.String] = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def has(key: java.lang.String, context: handsontableLib.handsontableMod.Handsontable): scala.Boolean = js.native
  def isRegistered(key: java.lang.String): scala.Boolean = js.native
  def once[K /* <: java.lang.String */](
    key: K,
    callback: /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): scala.Unit = js.native
  def once[K /* <: java.lang.String */](
    key: K,
    callback: /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any,
    context: handsontableLib.handsontableMod.Handsontable
  ): scala.Unit = js.native
  def once[K /* <: java.lang.String */](
    key: K,
    callback: js.Array[
      /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ]
  ): scala.Unit = js.native
  def once[K /* <: java.lang.String */](
    key: K,
    callback: js.Array[
      /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ],
    context: handsontableLib.handsontableMod.Handsontable
  ): scala.Unit = js.native
  def register(key: java.lang.String): scala.Unit = js.native
  def remove(key: java.lang.String, callback: js.Function): scala.Boolean = js.native
  def remove(
    key: java.lang.String,
    callback: js.Function,
    context: handsontableLib.handsontableMod.Handsontable
  ): scala.Boolean = js.native
  def run(
    context: handsontableLib.handsontableMod.Handsontable,
    key: java.lang.String,
    p1: js.UndefOr[js.Any],
    p2: js.UndefOr[js.Any],
    p3: js.UndefOr[js.Any],
    p4: js.UndefOr[js.Any],
    p5: js.UndefOr[js.Any],
    p6: js.UndefOr[js.Any]
  ): js.Any = js.native
}


package typings.handsontable.mod.Handsontable.Hooks

import typings.handsontable.mod.Handsontable
import typings.handsontable.mod.Handsontable.Bucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def add[K /* <: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */](
    key: K,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): Methods = js.native
  def add[K /* <: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */](
    key: K,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any,
    context: Handsontable
  ): Methods = js.native
  def add[K /* <: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */](
    key: K,
    callback: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ]
  ): Methods = js.native
  def add[K /* <: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */](
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
  def getRegistered(): js.Array[
    /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any
  ] = js.native
  def has(
    key: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any
  ): Boolean = js.native
  def has(
    key: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any,
    context: Handsontable
  ): Boolean = js.native
  def isRegistered(
    key: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any
  ): Boolean = js.native
  def once[K /* <: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */](
    key: K,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): Unit = js.native
  def once[K /* <: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */](
    key: K,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any,
    context: Handsontable
  ): Unit = js.native
  def once[K /* <: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */](
    key: K,
    callback: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ]
  ): Unit = js.native
  def once[K /* <: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */](
    key: K,
    callback: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ],
    context: Handsontable
  ): Unit = js.native
  def register(key: String): Unit = js.native
  def remove(
    key: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any,
    callback: js.Function
  ): Boolean = js.native
  def remove(
    key: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any,
    callback: js.Function,
    context: Handsontable
  ): Boolean = js.native
  def run(
    context: Handsontable,
    key: /* keyof handsontable.handsontable.Handsontable.Hooks.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any,
    p1: js.UndefOr[js.Any],
    p2: js.UndefOr[js.Any],
    p3: js.UndefOr[js.Any],
    p4: js.UndefOr[js.Any],
    p5: js.UndefOr[js.Any],
    p6: js.UndefOr[js.Any]
  ): js.Any = js.native
}


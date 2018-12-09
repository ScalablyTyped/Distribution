package typings
package jsforceLib.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/batch", "Batch")
@js.native
class Batch ()
  extends nodeLib.streamMod.Writable {
  def check(): js.Promise[BatchInfo] = js.native
  def check(callback: js.Function1[/* batchInfo */ BatchInfo, scala.Unit]): js.Promise[BatchInfo] = js.native
  def execute(): Batch = js.native
  def execute(input: java.lang.String): Batch = js.native
  def execute(
    input: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[BatchResultInfo], 
      scala.Unit
    ]
  ): Batch = js.native
  def execute(input: js.Array[jsforceLib.recordMod.Record[_]]): Batch = js.native
  def execute(
    input: js.Array[jsforceLib.recordMod.Record[_]],
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[BatchResultInfo], 
      scala.Unit
    ]
  ): Batch = js.native
  def execute(input: nodeLib.streamMod.Stream): Batch = js.native
  def execute(
    input: nodeLib.streamMod.Stream,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[BatchResultInfo], 
      scala.Unit
    ]
  ): Batch = js.native
  def poll(interval: scala.Double, timeout: scala.Double): scala.Unit = js.native
  def retrieve(): js.Promise[
    js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[BatchResultInfo]
  ] = js.native
  def retrieve(callback: js.Function1[/* batchInfo */ BatchInfo, scala.Unit]): js.Promise[
    js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[BatchResultInfo]
  ] = js.native
  def `then`(): js.Promise[_] = js.native
  def thenAll(callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
}


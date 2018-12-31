package typings
package gulpDashSequenceLib.gulpDashSequenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-sequence", JSImport.Namespace)
@js.native
object gulpDashSequenceModMembers extends js.Object {
  /*
  Sequence functions (apart from the one returning TaskFunction) generated using the following (requires lodash for the padding):
  const fnBase = `declare function seq(`;
  const argPad = _.pad('', fnBase.length, ' ');
  const maxArgs = 25;
  const outDone = [];
  for (let i = 1; i <= maxArgs; i++) {
  	let def = [];
    for (let j = 1; j <= i; j++) {
    	def.push(`s${j}: seq.Step`);
    }
    def.push(`done: seq.Done): void;`);
    outDone.push(def.join(`,\n${argPad}`));
  }
  console.log(fnBase + outDone.join(`\n${fnBase}`));
  */
  def apply(
    firstTask: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    additionalTasks: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step*
  ): gulpLib.gulpMod.GulpClientNs.TaskFunction = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s18: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s18: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s19: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s18: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s19: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s20: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s18: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s19: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s20: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s21: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s18: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s19: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s20: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s21: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s22: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s18: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s19: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s20: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s21: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s22: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s23: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s18: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s19: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s20: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s21: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s22: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s23: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s24: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def apply(
    s1: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s2: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s3: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s4: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s5: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s6: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s7: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s8: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s9: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s10: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s11: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s12: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s13: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s14: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s15: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s16: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s17: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s18: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s19: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s20: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s21: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s22: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s23: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s24: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    s25: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Step,
    done: gulpDashSequenceLib.gulpDashSequenceMod.seqNs.Done
  ): scala.Unit = js.native
  def use(gulp: gulpLib.gulpMod.GulpClientNs.Gulp): gulpDashSequenceLib.Anon_S1 = js.native
}


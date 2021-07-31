package typings.gulpSequence

import typings.gulp.mod.Gulp
import typings.gulp.mod.TaskFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @scala.inline
  def apply(firstTask: Step, additionalTasks: Step*): TaskFunction = (^.asInstanceOf[js.Dynamic].apply(firstTask.asInstanceOf[js.Any], additionalTasks.asInstanceOf[js.Any])).asInstanceOf[TaskFunction]
  @scala.inline
  def apply(s1: Step, done: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(s1: Step, s2: Step, done: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(s1: Step, s2: Step, s3: Step, done: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(s1: Step, s2: Step, s3: Step, s4: Step, done: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(s1: Step, s2: Step, s3: Step, s4: Step, s5: Step, done: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(s1: Step, s2: Step, s3: Step, s4: Step, s5: Step, s6: Step, done: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(s1: Step, s2: Step, s3: Step, s4: Step, s5: Step, s6: Step, s7: Step, done: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(s1: Step, s2: Step, s3: Step, s4: Step, s5: Step, s6: Step, s7: Step, s8: Step, done: Done): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    s18: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], s18.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    s18: Step,
    s19: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], s18.asInstanceOf[js.Any], s19.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    s18: Step,
    s19: Step,
    s20: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], s18.asInstanceOf[js.Any], s19.asInstanceOf[js.Any], s20.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    s18: Step,
    s19: Step,
    s20: Step,
    s21: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], s18.asInstanceOf[js.Any], s19.asInstanceOf[js.Any], s20.asInstanceOf[js.Any], s21.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    s18: Step,
    s19: Step,
    s20: Step,
    s21: Step,
    s22: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], s18.asInstanceOf[js.Any], s19.asInstanceOf[js.Any], s20.asInstanceOf[js.Any], s21.asInstanceOf[js.Any], s22.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    s18: Step,
    s19: Step,
    s20: Step,
    s21: Step,
    s22: Step,
    s23: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], s18.asInstanceOf[js.Any], s19.asInstanceOf[js.Any], s20.asInstanceOf[js.Any], s21.asInstanceOf[js.Any], s22.asInstanceOf[js.Any], s23.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    s18: Step,
    s19: Step,
    s20: Step,
    s21: Step,
    s22: Step,
    s23: Step,
    s24: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], s18.asInstanceOf[js.Any], s19.asInstanceOf[js.Any], s20.asInstanceOf[js.Any], s21.asInstanceOf[js.Any], s22.asInstanceOf[js.Any], s23.asInstanceOf[js.Any], s24.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    s1: Step,
    s2: Step,
    s3: Step,
    s4: Step,
    s5: Step,
    s6: Step,
    s7: Step,
    s8: Step,
    s9: Step,
    s10: Step,
    s11: Step,
    s12: Step,
    s13: Step,
    s14: Step,
    s15: Step,
    s16: Step,
    s17: Step,
    s18: Step,
    s19: Step,
    s20: Step,
    s21: Step,
    s22: Step,
    s23: Step,
    s24: Step,
    s25: Step,
    done: Done
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any], s5.asInstanceOf[js.Any], s6.asInstanceOf[js.Any], s7.asInstanceOf[js.Any], s8.asInstanceOf[js.Any], s9.asInstanceOf[js.Any], s10.asInstanceOf[js.Any], s11.asInstanceOf[js.Any], s12.asInstanceOf[js.Any], s13.asInstanceOf[js.Any], s14.asInstanceOf[js.Any], s15.asInstanceOf[js.Any], s16.asInstanceOf[js.Any], s17.asInstanceOf[js.Any], s18.asInstanceOf[js.Any], s19.asInstanceOf[js.Any], s20.asInstanceOf[js.Any], s21.asInstanceOf[js.Any], s22.asInstanceOf[js.Any], s23.asInstanceOf[js.Any], s24.asInstanceOf[js.Any], s25.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("gulp-sequence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def use(gulp: Gulp): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(gulp.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  type Done = js.Function1[/* error */ js.UndefOr[js.Any], Unit]
  
  type Step = String | js.Array[String]
}

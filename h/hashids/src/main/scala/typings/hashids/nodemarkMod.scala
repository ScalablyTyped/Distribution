package typings.hashids

import typings.hashids.hashidsStrings.hz
import typings.hashids.hashidsStrings.microseconds
import typings.hashids.hashidsStrings.milliseconds
import typings.hashids.hashidsStrings.nanoseconds
import typings.hashids.hashidsStrings.seconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodemarkMod {
  
  inline def apply(subject: js.Function0[Any]): BenchmarkResult = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[BenchmarkResult]
  inline def apply(subject: js.Function0[Any], setup: js.Function0[Any]): BenchmarkResult = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], setup.asInstanceOf[js.Any])).asInstanceOf[BenchmarkResult]
  inline def apply(subject: js.Function0[Any], setup: js.Function0[Any], durationMillis: Double): BenchmarkResult = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], setup.asInstanceOf[js.Any], durationMillis.asInstanceOf[js.Any])).asInstanceOf[BenchmarkResult]
  inline def apply(subject: js.Function0[Any], setup: Unit, durationMillis: Double): BenchmarkResult = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], setup.asInstanceOf[js.Any], durationMillis.asInstanceOf[js.Any])).asInstanceOf[BenchmarkResult]
  inline def apply(subject: js.Function1[/* callback */ js.Function1[/* repeated */ Any, Unit], Any]): js.Promise[BenchmarkResult] = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(
    subject: js.Function1[/* callback */ js.Function1[/* repeated */ Any, Unit], Any],
    setup: js.Function0[Any]
  ): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], setup.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(
    subject: js.Function1[/* callback */ js.Function1[/* repeated */ Any, Unit], Any],
    setup: js.Function0[Any],
    durationMillis: Double
  ): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], setup.asInstanceOf[js.Any], durationMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(
    subject: js.Function1[/* callback */ js.Function1[/* repeated */ Any, Unit], Any],
    setup: Unit,
    durationMillis: Double
  ): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], setup.asInstanceOf[js.Any], durationMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  
  @JSImport("nodemark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait BenchmarkResult extends StObject {
    
    /** the number of times the subject was invoked and measured */
    var count: Double = js.native
    
    /** the margin of error as a ratio of the mean */
    var error: Double = js.native
    
    /**
      * Returns the average number of executions per second,
      * rounded to the nearest whole number or the number of decimal places specified by precision.
      */
    def hz(): Double = js.native
    def hz(precision: Double): Double = js.native
    
    /** the fastest measured time in nanoseconds */
    var max: Double = js.native
    
    /** the average measured time in nanoseconds */
    var mean: Double = js.native
    
    /**
      * Returns this.mean, rounded to the nearest whole number
      * or the number of decimal places specified by `precision`
      */
    def microseconds(): Double = js.native
    def microseconds(precision: Double): Double = js.native
    
    /**
      * Returns this.mean, rounded to the nearest whole number
      * or the number of decimal places specified by `precision`
      */
    def milliseconds(): Double = js.native
    def milliseconds(precision: Double): Double = js.native
    
    /** the slowest measured time in nanoseconds */
    var min: Double = js.native
    
    /**
      * Returns this.mean, rounded to the nearest whole number
      * or the number of decimal places specified by `precision`
      */
    def nanoseconds(): Double = js.native
    def nanoseconds(precision: Double): Double = js.native
    
    /**
      * Returns the standard deviation per second,
      * rounded to the nearest whole number or the number of decimal places specified by precision.
      */
    def sd(): Double = js.native
    def sd(precision: Double): Double = js.native
    
    /**
      * Returns this.mean, rounded to the nearest whole number
      * or the number of decimal places specified by `precision`
      */
    def seconds(): Double = js.native
    def seconds(precision: Double): Double = js.native
    
    def toString(format: hz | nanoseconds | microseconds | milliseconds | seconds): String = js.native
  }
}

package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// To allow non-ES6 users the Set below
trait Reporter extends js.Object {
  var getLastError: js.UndefOr[js.Function0[Maybe[stdLib.Error]]] = js.undefined
  var onRunComplete: js.UndefOr[
    js.Function2[
      /* contexts */ Set[Context], 
      /* results */ AggregatedResult, 
      Maybe[js.Promise[scala.Unit]]
    ]
  ] = js.undefined
  var onRunStart: js.UndefOr[
    js.Function2[/* results */ AggregatedResult, /* options */ ReporterOnStartOptions, scala.Unit]
  ] = js.undefined
  var onTestResult: js.UndefOr[
    js.Function3[
      /* test */ Test, 
      /* testResult */ TestResult, 
      /* aggregatedResult */ AggregatedResult, 
      scala.Unit
    ]
  ] = js.undefined
  var onTestStart: js.UndefOr[js.Function1[/* test */ Test, scala.Unit]] = js.undefined
}


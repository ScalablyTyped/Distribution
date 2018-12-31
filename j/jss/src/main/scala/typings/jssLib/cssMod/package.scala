package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssMod {
  type CSSProperties = ObservableProperties[csstypeLib.csstypeMod.Properties[Length]] with ObservableProperties[csstypeLib.csstypeMod.PropertiesHyphen[Length]]
  type JssExpandArr = jssLib.jssLibStrings.JssExpandArr with JssExpand
  type Length = java.lang.String | scala.Double
  type ObservableProperties[P] = jssLib.jssLibStrings.ObservableProperties with P
  type SimpleStyle = CSSProperties with JssProps with JssExpandArr
  type Style = SimpleStyle | indefiniteDashObservableLib.distTypesMod.Observable[csstypeLib.csstypeMod.PropertiesHyphen[Length]]
}

package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssMod {
  type CSSProperties = ObservableProperties[csstypeLib.csstypeMod.Properties[Length]] with ObservableProperties[csstypeLib.csstypeMod.PropertiesHyphen[Length]]
  type JssExpandArr = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in 'animation' | 'background' | 'border' | 'boxShadow' | 'flex' | 'font' | 'listStyle' | 'margin' | 'padding' | 'outline' | 'textShadow' | 'transition' ]:? jss.jss/css.JssExpand[k] | std.Array<jss.jss/css.JssExpand[k]>}
    */ jssLib.jssLibStrings.JssExpandArr with js.Any
  type Length = java.lang.String | scala.Double
  type ObservableProperties[P] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof P ]: P[K] | indefinite-observable.indefinite-observable/dist/types.Observable<P[K]>}
    */ jssLib.jssLibStrings.ObservableProperties with js.Any
  type SimpleStyle = CSSProperties with JssProps with JssExpandArr
  type Style = SimpleStyle | indefiniteDashObservableLib.distTypesMod.Observable[csstypeLib.csstypeMod.PropertiesHyphen[Length]]
}

package typings.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssMod {
  import typings.csstype.csstypeMod.Properties
  import typings.csstype.csstypeMod.PropertiesHyphen
  import typings.indefiniteDashObservable.distTypesMod.Observable

  type CSSProperties = ObservableProperties[Properties[Length]] with ObservableProperties[PropertiesHyphen[Length]]
  type JssExpandArr = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in 'animation' | 'background' | 'border' | 'boxShadow' | 'flex' | 'font' | 'listStyle' | 'margin' | 'padding' | 'outline' | 'textShadow' | 'transition' ]:? jss.jss/css.JssExpand[k] | std.Array<jss.jss/css.JssExpand[k]>}
    */ typings.jss.jssStrings.JssExpandArr with js.Any
  type Length = String | Double
  type ObservableProperties[P] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof P ]: P[K] | indefinite-observable.indefinite-observable/dist/types.Observable<P[K]>}
    */ typings.jss.jssStrings.ObservableProperties with js.Any
  type SimpleStyle = CSSProperties with JssProps with JssExpandArr
  type Style = SimpleStyle | Observable[PropertiesHyphen[Length]]
}

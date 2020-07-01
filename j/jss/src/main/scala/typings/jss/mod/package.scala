package typings.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Classes[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typings.std.Record[Name, java.lang.String]
  type CreateGenerateId_ = js.Function1[
    /* options */ js.UndefOr[typings.jss.mod.CreateGenerateIdOptions], 
    typings.jss.mod.GenerateId
  ]
  // TODO: Type data better, currently typed as any for allowing to override it
  type Func[R] = js.Function1[/* data */ js.Any, R]
  type GenerateId = js.Function2[
    /* rule */ typings.jss.mod.Rule, 
    /* sheet */ js.UndefOr[typings.jss.mod.StyleSheet[java.lang.String]], 
    java.lang.String
  ]
  type InsertionPoint = java.lang.String | typings.std.HTMLElement | typings.std.Comment
  type JssStyle = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof jss.jss.NormalCssProperties | string ]: jss.jss.NormalCssValues<K> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jss.jss.JssStyle * / object | jss.jss.Func<jss.jss.NormalCssValues<K> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jss.jss.JssStyle * / object | undefined>}
    */ typings.jss.jssStrings.JssStyle with org.scalablytyped.runtime.TopLevel[js.Any]
  type JssValue = java.lang.String | scala.Double | (js.Array[
    java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]) | typings.jss.jssStrings.Exclamationmarkimportant
  ]) | scala.Null | typings.jss.jssBooleans.`false`
  type Keyframes[Name /* <: java.lang.String */] = typings.std.Record[Name, java.lang.String]
  type NormalCssProperties = typings.csstype.mod.Properties[java.lang.String | scala.Double]
  type NormalCssValues[K] = typings.jss.mod.JssValue | (/* import warning: importer.ImportType#apply Failed type conversion: jss.jss.NormalCssProperties[K] */ js.Any)
  type Styles[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typings.std.Record[
    Name, 
    typings.jss.mod.JssStyle | java.lang.String | (typings.jss.mod.Func[js.UndefOr[typings.jss.mod.JssStyle | java.lang.String | scala.Null]])
  ]
}

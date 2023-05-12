package typings.highcharts.mod

import typings.highcharts.highchartsStrings.all
import typings.highcharts.highchartsStrings.end
import typings.highcharts.highchartsStrings.point_
import typings.highcharts.highchartsStrings.stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadiusOptionsObject extends StObject {
  
  /**
    * The border radius. A number signifies pixels. A percentage string, like
    * for example `50%`, signifies a relative size. For columns this is
    * relative to the column width, for pies it is relative to the radius and
    * the inner radius.
    */
  var radius: Double | String
  
  /**
    * The scope of the rounding for column charts. In a stacked column chart,
    * the value `point` means each single point will get rounded corners. The
    * value `stack` means the rounding will apply to the full stack, so that
    * only points close to the top or bottom will receive rounding.
    */
  var scope: point_ | stack
  
  /**
    * For column charts, where in the point or stack to apply rounding. The
    * `end` value means only those corners at the point value will be rounded,
    * leaving the corners at the base or threshold unrounded. This is the most
    * intuitive behaviour. The `all` value means also the base will be rounded.
    */
  var where: all | end
}
object BorderRadiusOptionsObject {
  
  inline def apply(radius: Double | String, scope: point_ | stack, where: all | end): BorderRadiusOptionsObject = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderRadiusOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setScope(value: point_ | stack): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setWhere(value: all | end): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}

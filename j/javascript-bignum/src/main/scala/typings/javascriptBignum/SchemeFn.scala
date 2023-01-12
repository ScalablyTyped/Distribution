package typings.javascriptBignum

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemeFn
  extends StObject
     with /* opname */ StringDictionary[SchemeOperator] {
  
  def abs(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("abs")
  var abs_Original: SchemeOperator
  
  def acos(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("acos")
  var acos_Original: SchemeOperator
  
  def angle(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("angle")
  var angle_Original: SchemeOperator
  
  def asin(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("asin")
  var asin_Original: SchemeOperator
  
  def atan(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("atan")
  var atan_Original: SchemeOperator
  
  def ceiling(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("ceiling")
  var ceiling_Original: SchemeOperator
  
  def cos(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("cos")
  var cos_Original: SchemeOperator
  
  def denominator(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("denominator")
  var denominator_Original: SchemeOperator
  
  def div(args: (String | SchemeNumber | Double)*): SchemeNumber
  
  def div0(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("div0")
  var div0_Original: SchemeOperator
  
  @JSName("div")
  var div_Original: SchemeOperator
  
  def exact(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("exact")
  var exact_Original: SchemeOperator
  
  def exp(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("exp")
  var exp_Original: SchemeOperator
  
  def expt(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("expt")
  var expt_Original: SchemeOperator
  
  def floor(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("floor")
  var floor_Original: SchemeOperator
  
  def gcd(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("gcd")
  var gcd_Original: SchemeOperator
  
  def inexact(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("inexact")
  var inexact_Original: SchemeOperator
  
  def lcm(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("lcm")
  var lcm_Original: SchemeOperator
  
  def log(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("log")
  var log_Original: SchemeOperator
  
  def magnitude(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("magnitude")
  var magnitude_Original: SchemeOperator
  
  def max(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("max")
  var max_Original: SchemeOperator
  
  def min(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("min")
  var min_Original: SchemeOperator
  
  def mod(args: (String | SchemeNumber | Double)*): SchemeNumber
  
  def mod0(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("mod0")
  var mod0_Original: SchemeOperator
  
  @JSName("mod")
  var mod_Original: SchemeOperator
  
  def numerator(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("numerator")
  var numerator_Original: SchemeOperator
  
  def rationalize(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("rationalize")
  var rationalize_Original: SchemeOperator
  
  def round(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("round")
  var round_Original: SchemeOperator
  
  def sin(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("sin")
  var sin_Original: SchemeOperator
  
  def sqrt(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("sqrt")
  var sqrt_Original: SchemeOperator
  
  def tan(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("tan")
  var tan_Original: SchemeOperator
  
  def truncate(args: (String | SchemeNumber | Double)*): SchemeNumber
  @JSName("truncate")
  var truncate_Original: SchemeOperator
}
object SchemeFn {
  
  inline def apply(
    abs: SchemeOperator,
    acos: SchemeOperator,
    angle: SchemeOperator,
    asin: SchemeOperator,
    atan: SchemeOperator,
    ceiling: SchemeOperator,
    cos: SchemeOperator,
    denominator: SchemeOperator,
    div: SchemeOperator,
    div0: SchemeOperator,
    exact: SchemeOperator,
    exp: SchemeOperator,
    expt: SchemeOperator,
    floor: SchemeOperator,
    gcd: SchemeOperator,
    inexact: SchemeOperator,
    lcm: SchemeOperator,
    log: SchemeOperator,
    magnitude: SchemeOperator,
    max: SchemeOperator,
    min: SchemeOperator,
    mod: SchemeOperator,
    mod0: SchemeOperator,
    numerator: SchemeOperator,
    rationalize: SchemeOperator,
    round: SchemeOperator,
    sin: SchemeOperator,
    sqrt: SchemeOperator,
    tan: SchemeOperator,
    truncate: SchemeOperator
  ): SchemeFn = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], acos = acos.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], asin = asin.asInstanceOf[js.Any], atan = atan.asInstanceOf[js.Any], ceiling = ceiling.asInstanceOf[js.Any], cos = cos.asInstanceOf[js.Any], denominator = denominator.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], div0 = div0.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], expt = expt.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], gcd = gcd.asInstanceOf[js.Any], inexact = inexact.asInstanceOf[js.Any], lcm = lcm.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], mod0 = mod0.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any], rationalize = rationalize.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any], sqrt = sqrt.asInstanceOf[js.Any], tan = tan.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemeFn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemeFn] (val x: Self) extends AnyVal {
    
    inline def setAbs(value: SchemeOperator): Self = StObject.set(x, "abs", value.asInstanceOf[js.Any])
    
    inline def setAcos(value: SchemeOperator): Self = StObject.set(x, "acos", value.asInstanceOf[js.Any])
    
    inline def setAngle(value: SchemeOperator): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAsin(value: SchemeOperator): Self = StObject.set(x, "asin", value.asInstanceOf[js.Any])
    
    inline def setAtan(value: SchemeOperator): Self = StObject.set(x, "atan", value.asInstanceOf[js.Any])
    
    inline def setCeiling(value: SchemeOperator): Self = StObject.set(x, "ceiling", value.asInstanceOf[js.Any])
    
    inline def setCos(value: SchemeOperator): Self = StObject.set(x, "cos", value.asInstanceOf[js.Any])
    
    inline def setDenominator(value: SchemeOperator): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setDiv(value: SchemeOperator): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
    
    inline def setDiv0(value: SchemeOperator): Self = StObject.set(x, "div0", value.asInstanceOf[js.Any])
    
    inline def setExact(value: SchemeOperator): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExp(value: SchemeOperator): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpt(value: SchemeOperator): Self = StObject.set(x, "expt", value.asInstanceOf[js.Any])
    
    inline def setFloor(value: SchemeOperator): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    inline def setGcd(value: SchemeOperator): Self = StObject.set(x, "gcd", value.asInstanceOf[js.Any])
    
    inline def setInexact(value: SchemeOperator): Self = StObject.set(x, "inexact", value.asInstanceOf[js.Any])
    
    inline def setLcm(value: SchemeOperator): Self = StObject.set(x, "lcm", value.asInstanceOf[js.Any])
    
    inline def setLog(value: SchemeOperator): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setMagnitude(value: SchemeOperator): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    inline def setMax(value: SchemeOperator): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: SchemeOperator): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMod(value: SchemeOperator): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setMod0(value: SchemeOperator): Self = StObject.set(x, "mod0", value.asInstanceOf[js.Any])
    
    inline def setNumerator(value: SchemeOperator): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
    
    inline def setRationalize(value: SchemeOperator): Self = StObject.set(x, "rationalize", value.asInstanceOf[js.Any])
    
    inline def setRound(value: SchemeOperator): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setSin(value: SchemeOperator): Self = StObject.set(x, "sin", value.asInstanceOf[js.Any])
    
    inline def setSqrt(value: SchemeOperator): Self = StObject.set(x, "sqrt", value.asInstanceOf[js.Any])
    
    inline def setTan(value: SchemeOperator): Self = StObject.set(x, "tan", value.asInstanceOf[js.Any])
    
    inline def setTruncate(value: SchemeOperator): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
  }
}

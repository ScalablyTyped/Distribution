package typings.ipSubnetCalculator

import typings.ipSubnetCalculator.mod.SubnetResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object IpSubnetCalculator {
    
    @JSGlobal("IpSubnetCalculator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def calculate(ipStart: String, ipEnd: String): js.Array[SubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(ipStart.asInstanceOf[js.Any], ipEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[SubnetResult]]
    inline def calculate(ipStart: String, ipEnd: Double): js.Array[SubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(ipStart.asInstanceOf[js.Any], ipEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[SubnetResult]]
    inline def calculate(ipStart: Double, ipEnd: String): js.Array[SubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(ipStart.asInstanceOf[js.Any], ipEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[SubnetResult]]
    inline def calculate(ipStart: Double, ipEnd: Double): js.Array[SubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(ipStart.asInstanceOf[js.Any], ipEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[SubnetResult]]
    
    inline def calculateCIDRPrefix(ip: String, subnetMask: String): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCIDRPrefix")(ip.asInstanceOf[js.Any], subnetMask.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
    inline def calculateCIDRPrefix(ip: String, subnetMask: Double): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCIDRPrefix")(ip.asInstanceOf[js.Any], subnetMask.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
    inline def calculateCIDRPrefix(ip: Double, subnetMask: String): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCIDRPrefix")(ip.asInstanceOf[js.Any], subnetMask.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
    inline def calculateCIDRPrefix(ip: Double, subnetMask: Double): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCIDRPrefix")(ip.asInstanceOf[js.Any], subnetMask.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
    
    inline def calculateSubnetMask(ip: String, prefixSize: Double): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSubnetMask")(ip.asInstanceOf[js.Any], prefixSize.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
    inline def calculateSubnetMask(ip: Double, prefixSize: Double): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSubnetMask")(ip.asInstanceOf[js.Any], prefixSize.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
    
    inline def isDecimalIp(ipNum: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimalIp")(ipNum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isIp(ipStr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIp")(ipStr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toDecimal(ip: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(ip.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def toDecimal(ip: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(ip.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toString_(num: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toString_(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}

package typings.hummerEnv

import typings.hummerEnv.hummerEnvInts.`0`
import typings.hummerEnv.hummerEnvInts.`1`
import typings.hummerEnv.hummerEnvInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasView
  extends StObject
     with HummerComponent {
  
  /**
    * 画弧形
    * @param x 圆心坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param y 圆心坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param raduis 半径 ， 支持px，hm 单位， 如果不写单位就是dp
    * @param startAngle 起始弧度 ，
    * @param endAngle 结束弧度 ，
    * @param clockwise ture 顺时针 ， false 逆时针
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, clockwise: Boolean): Unit = js.native
  
  /**
    * 绘制图片
    * @param src 图片资源链接,远程url或本地图片名
    * @param x 图片左上角坐标x值 , 支持px，hm 单位， 如果不写单位就是dp
    * @param y 图片左上角坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param width 图片宽 ,支持px，hm 单位， 如果不写单位就是dp
    * @param height 图片高 ,支持px，hm 单位， 如果不写单位就是dp
    */
  def drawImage(src: String, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * 根据入参，在起始点与终点之间画一条线段
    * @param fromX 起点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param fromY 起点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param toX 终点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param toY 终点的y值，支持px，hm 单位， 如果不写单位就是dp
    */
  def drawLine(fraomX: Double, fromY: Double, toX: Double, toY: Double): Unit = js.native
  
  /**
    * 填充圆形
    * @param x 圆心坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param y 圆心坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param raduis 半径 ， 支持px，hm 单位， 如果不写单位就是dp
    */
  def fillCircle(x: Double, y: Double, radius: Double): Unit = js.native
  
  /**
    * 设置填充颜色
    * @param colorHex 颜色16进制
    */
  def fillColor(colorHex: String): Unit = js.native
  
  /**
    * 填充椭圆
    * @param x 椭圆所在矩形左上角坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param y 椭圆所在矩形左上角坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param trailX 椭圆所在矩形右下角坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param trailY 椭圆所在矩形右下角坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    */
  def fillEllipse(x: Double, y: Double, trailX: Double, trailY: Double): Unit = js.native
  
  /**
    * 填充矩形
    * @param x 矩形左上角坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param y 矩形左上角坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param w 矩形宽，支持px，hm 单位， 如果不写单位就是dp
    * @param h 矩形高，支持px，hm 单位， 如果不写单位就是dp
    */
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /**
    * 填充圆形
    * @param x 文本左上角坐标x值 , 支持px，hm 单位， 如果不写单位就是dp
    * @param y 文本左上角坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param maxWidth 文本换行的最大宽度, 0 代表不换行,支持px，hm 单位， 如果不写单位就是dp
    */
  def fillText(x: Double, y: Double, maxWidth: Double): Unit = js.native
  
  /**
    * 设置绘制文本字号
    * @param size 字号大小
    */
  def fontSize(size: Double): Unit = js.native
  
  /**
    * 设置线头样式
    * @param value 0 : LineCapButt, ， 1:LineCapRound   2:LineCapSquare
    */
  def lineCap(value: `0` | `1` | `2`): Unit = js.native
  
  /**
    * 设置stroke的颜色
    * @param colorHex colorHex 颜色16进制
    */
  def lineColor(colorHex: Double): Unit = js.native
  
  /**
    * 设置折线折点样式
    * @param value 0 : LineJoinMiter, ， 1: LineJoinRound  2:LineJoinBevel
    */
  def lineJoin(value: `0` | `1` | `2`): Unit = js.native
  
  /**
    * 设置stroke的线粗细
    * @param widthValue 粗细值，支持px，hm 单位， 如果不写单位就是dp
    */
  def lineWidth(widthValue: Double): Unit = js.native
  
  /**
    * 画圆形
    * @param x 圆心坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param y 圆心坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param raduis 半径 ， 支持px，hm 单位， 如果不写单位就是dp
    */
  def strokeCircle(x: Double, y: Double, radius: Double): Unit = js.native
  
  /**
    * 画椭圆
    * @param x 椭圆所在矩形左上角坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param y 椭圆所在矩形左上角坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param trailX 椭圆所在矩形右下角坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param trailY 椭圆所在矩形右下角坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    */
  def strokeEllipse(x: Double, y: Double, trailX: Double, trailY: Double): Unit = js.native
  
  /**
    * 画矩形
    * @param x 矩形左上角坐标点的x值，支持px，hm 单位， 如果不写单位就是dp
    * @param y 矩形左上角坐标点的y值，支持px，hm 单位， 如果不写单位就是dp
    * @param w 矩形宽，支持px，hm 单位， 如果不写单位就是dp
    * @param h 矩形高，支持px，hm 单位， 如果不写单位就是dp
    */
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /**
    * 设置绘制文本字色
    * @param colorHex 字体颜色 16进制色号
    */
  def textColor(colorHex: String): Unit = js.native
}

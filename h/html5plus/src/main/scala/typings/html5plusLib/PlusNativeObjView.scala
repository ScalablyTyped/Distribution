package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 原生控件对象
  * 原生控件对象可用于在屏幕上绘制图片或文本内容，当控件不再使用时需要调用close方法销毁控件。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjView extends js.Object {
  /**
    * View对象的标识
    * 在创建原生控件View对象时设置，如果没有设置标识，此属性值为null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * 添加事件监听器
    * 向View控件添加事件监听器，当指定的事件发生时，将触发listener函数的执行。
    * 		可多次调用此方法向Webview添加多个监听器，当监听的事件发生时，将按照添加的先后顺序执行。
    * 		可通过setTouchEventRect方法指定监听触屏操作的区域。
    * 		注意：默认View控件拦截处理触屏事件，可调用view.interceptTouchEvent(false)改变为不拦截处理触屏事件（透传）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def addEventListener(): scala.Unit = js.native
  def addEventListener(event: PlusNativeObjViewEvents): scala.Unit = js.native
  def addEventListener(event: PlusNativeObjViewEvents, listener: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    event: PlusNativeObjViewEvents,
    listener: js.Function1[/* result */ js.Any, scala.Unit],
    capture: scala.Boolean
  ): scala.Unit = js.native
  /**
    * View控件内容动画
    * 动画后可能会导致View控件显示内容改变，可通过调用restore方法恢复。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def animate(): scala.Unit = js.native
  def animate(options: PlusNativeObjViewAnimationOptions): scala.Unit = js.native
  def animate(options: PlusNativeObjViewAnimationOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 静态方法，关闭原生动画窗口
    * 通过plus.nativeObj.View.startAnimation方法开始原生动画后，不会自动关闭原生动画窗口对象，需要调用此方法关闭原生动画。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def clearAnimation(): scala.Unit = js.native
  def clearAnimation(`type`: java.lang.String): scala.Unit = js.native
  /**
    * 清空矩形区域
    * 清除指定矩形区域内容，透明显示其后面的内容。
    * 	可多次调用设置多个区域透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def clearRect(): scala.Unit = js.native
  def clearRect(position: PlusNativeObjPosition): scala.Unit = js.native
  def clearRect(position: PlusNativeObjPosition, id: java.lang.String): scala.Unit = js.native
  /**
    * 关闭View控件
    * 释放View控件资源，View对象不可再操作，如果View控件已经显示则自动隐藏。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def close(): scala.Unit = js.native
  /**
    * 绘制内容
    * 在当前View控件之上绘制指定的内容，可一次指定绘制多个元素，绘制元素可以是图片/矩形区域/文本，
    * 	即将多次调用drawBitmap/drawRect/drawText方法合并调用一次draw方法来实现，
    * 	推荐使用draw方法来替换多次调用drawBitmap/drawRect/drawText。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def draw(): scala.Unit = js.native
  def draw(tags: js.Array[PlusNativeObj]): scala.Unit = js.native
  /**
    * 绘制图片
    * 在当前View控件之上绘制指定的图片，如果图片无效则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawBitmap(): scala.Unit = js.native
  def drawBitmap(src: java.lang.String): scala.Unit = js.native
  def drawBitmap(src: java.lang.String, sprite: PlusNativeObjPosition): scala.Unit = js.native
  def drawBitmap(src: java.lang.String, sprite: PlusNativeObjPosition, position: PlusNativeObjPosition): scala.Unit = js.native
  def drawBitmap(
    src: java.lang.String,
    sprite: PlusNativeObjPosition,
    position: PlusNativeObjPosition,
    id: java.lang.String
  ): scala.Unit = js.native
  /**
    * 绘制输入框
    * 在当前View控件之上绘制输入框。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawInput(): scala.Unit = js.native
  def drawInput(position: PlusNativeObjPosition): scala.Unit = js.native
  def drawInput(position: PlusNativeObjPosition, styles: PlusNativeObjInputStyles): scala.Unit = js.native
  def drawInput(position: PlusNativeObjPosition, styles: PlusNativeObjInputStyles, id: java.lang.String): scala.Unit = js.native
  /**
    * 绘制矩形区域
    * 在当前View控件之上绘制指定颜色的矩形区域。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawRect(): scala.Unit = js.native
  def drawRect(styles: PlusNativeObjRectStyles): scala.Unit = js.native
  def drawRect(styles: PlusNativeObjRectStyles, position: PlusNativeObjPosition): scala.Unit = js.native
  def drawRect(styles: PlusNativeObjRectStyles, position: PlusNativeObjPosition, id: java.lang.String): scala.Unit = js.native
  /**
    * 绘制富文本
    * 在当前View控件之上绘制指定的文本内容，如果文本为空则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawRichText(): scala.Unit = js.native
  def drawRichText(text: java.lang.String): scala.Unit = js.native
  def drawRichText(text: java.lang.String, position: PlusNativeObjPosition): scala.Unit = js.native
  def drawRichText(text: java.lang.String, position: PlusNativeObjPosition, styles: PlusNativeObjRichTextStyles): scala.Unit = js.native
  def drawRichText(
    text: java.lang.String,
    position: PlusNativeObjPosition,
    styles: PlusNativeObjRichTextStyles,
    id: java.lang.String
  ): scala.Unit = js.native
  /**
    * 绘制文本
    * 在当前View控件之上绘制指定的文本内容，如果文本为空则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawText(): scala.Unit = js.native
  def drawText(text: java.lang.String): scala.Unit = js.native
  def drawText(text: java.lang.String, position: PlusNativeObjPosition): scala.Unit = js.native
  def drawText(text: java.lang.String, position: PlusNativeObjPosition, styles: PlusNativeObjTextStyles): scala.Unit = js.native
  def drawText(
    text: java.lang.String,
    position: PlusNativeObjPosition,
    styles: PlusNativeObjTextStyles,
    id: java.lang.String
  ): scala.Unit = js.native
  /**
    * 获取编辑框的焦点状态
    * 通过id查找到指定的编辑框，获取其焦点状态。
    * 	如果指定的id无效则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def getInputFocusById(): scala.Boolean = js.native
  def getInputFocusById(id: java.lang.String): scala.Boolean = js.native
  /**
    * 获取编辑框的内容
    * 通过id查找到指定的编辑框，获取其输入的字符串。
    * 	如果指定的id无效则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def getInputValueById(): java.lang.String = js.native
  def getInputValueById(id: java.lang.String): java.lang.String = js.native
  /**
    * 静态方法，获取指定标识的View控件对象
    * 如果存在多个指定id标识的View对象，则返回第一个创建的View控件对象。
    * 	如果不存在指定id标识的View对象，则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def getViewById(): PlusNativeObjView = js.native
  def getViewById(id: java.lang.String): PlusNativeObjView = js.native
  /**
    * 隐藏View控件
    * 将View控件从屏幕隐藏，如果View控件未显示则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def hide(): scala.Unit = js.native
  /**
    * 是否拦截View控件的触屏事件
    * 设置为拦截后View控件上的触屏事件不再传递（即不透传），否则触屏事件将继续传递给View控件下的其它窗口处理（即透传）。
    * 	注意：View控件默认拦截触屏事件（不透传）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def interceptTouchEvent(): scala.Unit = js.native
  def interceptTouchEvent(intercept: scala.Boolean): scala.Unit = js.native
  /**
    * 获取View控件的显示状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def isVisible(): scala.Boolean = js.native
  /**
    * 重置view控件显示内容
    * 清除调用drawBitmap、drawText方法绘制的内容，将View控件重置为空内容（透明不可见）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def reset(): scala.Unit = js.native
  /**
    * 恢复View控件显示内容
    * 恢复调用animate方法改变View控件的内容，更新至动画前的内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def restore(): scala.Unit = js.native
  /**
    * 设置编辑框的焦点状态
    * 通过id查找到指定的编辑框，并设置编辑框的焦点状态。
    * 	如果指定的id无效则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def setInputFocusById(): java.lang.String = js.native
  def setInputFocusById(id: java.lang.String): java.lang.String = js.native
  def setInputFocusById(id: java.lang.String, focusable: scala.Boolean): java.lang.String = js.native
  /**
    * 设置View控件的样式
    * 动态更新View控件样式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def setStyle(): scala.Unit = js.native
  def setStyle(styles: PlusNativeObjViewStyles): scala.Unit = js.native
  /**
    * 指定监听触屏事件区域
    * 当调用addEventListener监听View控件事件时，可调用此方法限定监听事件的区域，仅当用户触屏操作在指定区域时才触发监听事件。
    * 	非限定监听事件的区域则不拦截，透传给其它窗口处理。
    * 	注意：此操作覆盖之前设置的区域。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def setTouchEventRect(): scala.Unit = js.native
  def setTouchEventRect(rect: js.Array[PlusNativeObj]): scala.Unit = js.native
  /**
    * 显示View控件
    * 将View控件显示到屏幕，显示在所有Webview窗口之上。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def show(): scala.Unit = js.native
  /**
    * 静态方法，开始原生动画
    * 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def startAnimation(): scala.Unit = js.native
  def startAnimation(options: PlusNativeObjAnimationOptions): scala.Unit = js.native
  def startAnimation(options: PlusNativeObjAnimationOptions, view: PlusNativeObjAnimationViewStyles): scala.Unit = js.native
  def startAnimation(
    options: PlusNativeObjAnimationOptions,
    view: PlusNativeObjAnimationViewStyles,
    otherview: PlusNativeObjAnimationViewStyles
  ): scala.Unit = js.native
  def startAnimation(
    options: PlusNativeObjAnimationOptions,
    view: PlusNativeObjAnimationViewStyles,
    otherview: PlusNativeObjAnimationViewStyles,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}


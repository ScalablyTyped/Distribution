package typings.kbmRobot

import org.scalablytyped.runtime.Shortcut
import typings.kbmRobot.kbmRobotNumbers.`6`
import typings.kbmRobot.kbmRobotNumbers.`7`
import typings.kbmRobot.kbmRobotStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("kbm-robot", JSImport.Namespace)
  @js.native
  val ^ : KBMRobot = js.native
  
  @js.native
  trait KBMRobot extends StObject {
    
    def go(): js.Promise[Unit] = js.native
    
    def mouseClick(button: MouseButton): KBMRobot = js.native
    def mouseClick(button: MouseButton, delay: Double): KBMRobot = js.native
    
    def mouseMove(x: Double, y: Double): KBMRobot = js.native
    
    def mousePress(button: MouseButton): KBMRobot = js.native
    
    def mouseRelease(button: MouseButton): KBMRobot = js.native
    
    def mouseScroll(amount: Double): KBMRobot = js.native
    
    def press(key: Key): KBMRobot = js.native
    
    def release(key: Key): KBMRobot = js.native
    
    def sleep(ms: Double): KBMRobot = js.native
    
    def startJar(): Unit = js.native
    def startJar(jre_version: `6` | `7`): Unit = js.native
    
    def stopJar(): Unit = js.native
    
    def `type`(key: Key): KBMRobot = js.native
    def `type`(key: Key, delay: Double): KBMRobot = js.native
    
    def typeString(): KBMRobot = js.native
    def typeString(str: String): KBMRobot = js.native
    def typeString(str: String, downDelay: Double): KBMRobot = js.native
    def typeString(str: String, downDelay: Double, upDelay: Double): KBMRobot = js.native
    def typeString(str: String, downDelay: Unit, upDelay: Double): KBMRobot = js.native
    def typeString(str: Unit, downDelay: Double): KBMRobot = js.native
    def typeString(str: Unit, downDelay: Double, upDelay: Double): KBMRobot = js.native
    def typeString(str: Unit, downDelay: Unit, upDelay: Double): KBMRobot = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.kbmRobot.kbmRobotStrings.VK_ENTER
    - typings.kbmRobot.kbmRobotStrings.VK_BACK_SPACE
    - typings.kbmRobot.kbmRobotStrings.VK_TAB
    - typings.kbmRobot.kbmRobotStrings.VK_CANCEL
    - typings.kbmRobot.kbmRobotStrings.VK_CLEAR
    - typings.kbmRobot.kbmRobotStrings.VK_SHIFT
    - typings.kbmRobot.kbmRobotStrings.VK_CONTROL
    - typings.kbmRobot.kbmRobotStrings.VK_ALT
    - typings.kbmRobot.kbmRobotStrings.VK_PAUSE
    - typings.kbmRobot.kbmRobotStrings.VK_CAPS_LOCK
    - typings.kbmRobot.kbmRobotStrings.VK_ESCAPE
    - typings.kbmRobot.kbmRobotStrings.VK_SPACE
    - typings.kbmRobot.kbmRobotStrings.VK_PAGE_UP
    - typings.kbmRobot.kbmRobotStrings.VK_PAGE_DOWN
    - typings.kbmRobot.kbmRobotStrings.VK_END
    - typings.kbmRobot.kbmRobotStrings.VK_HOME
    - typings.kbmRobot.kbmRobotStrings.VK_LEFT
    - typings.kbmRobot.kbmRobotStrings.VK_UP
    - typings.kbmRobot.kbmRobotStrings.VK_RIGHT
    - typings.kbmRobot.kbmRobotStrings.VK_DOWN
    - typings.kbmRobot.kbmRobotStrings.VK_COMMA
    - typings.kbmRobot.kbmRobotStrings.VK_MINUS
    - typings.kbmRobot.kbmRobotStrings.VK_PERIOD
    - typings.kbmRobot.kbmRobotStrings.VK_SLASH
    - typings.kbmRobot.kbmRobotStrings.VK_0
    - typings.kbmRobot.kbmRobotStrings.VK_1
    - typings.kbmRobot.kbmRobotStrings.VK_2
    - typings.kbmRobot.kbmRobotStrings.VK_3
    - typings.kbmRobot.kbmRobotStrings.VK_4
    - typings.kbmRobot.kbmRobotStrings.VK_5
    - typings.kbmRobot.kbmRobotStrings.VK_6
    - typings.kbmRobot.kbmRobotStrings.VK_7
    - typings.kbmRobot.kbmRobotStrings.VK_8
    - typings.kbmRobot.kbmRobotStrings.VK_9
    - typings.kbmRobot.kbmRobotStrings.VK_SEMICOLON
    - typings.kbmRobot.kbmRobotStrings.VK_EQUALS
    - typings.kbmRobot.kbmRobotStrings.VK_A
    - typings.kbmRobot.kbmRobotStrings.VK_B
    - typings.kbmRobot.kbmRobotStrings.VK_C
    - typings.kbmRobot.kbmRobotStrings.VK_D
    - typings.kbmRobot.kbmRobotStrings.VK_E
    - typings.kbmRobot.kbmRobotStrings.VK_F
    - typings.kbmRobot.kbmRobotStrings.VK_G
    - typings.kbmRobot.kbmRobotStrings.VK_H
    - typings.kbmRobot.kbmRobotStrings.VK_I
    - typings.kbmRobot.kbmRobotStrings.VK_J
    - typings.kbmRobot.kbmRobotStrings.VK_K
    - typings.kbmRobot.kbmRobotStrings.VK_L
    - typings.kbmRobot.kbmRobotStrings.VK_M
    - typings.kbmRobot.kbmRobotStrings.VK_N
    - typings.kbmRobot.kbmRobotStrings.VK_O
    - typings.kbmRobot.kbmRobotStrings.VK_P
    - typings.kbmRobot.kbmRobotStrings.VK_Q
    - typings.kbmRobot.kbmRobotStrings.VK_R
    - typings.kbmRobot.kbmRobotStrings.VK_S
    - typings.kbmRobot.kbmRobotStrings.VK_T
    - typings.kbmRobot.kbmRobotStrings.VK_U
    - typings.kbmRobot.kbmRobotStrings.VK_V
    - typings.kbmRobot.kbmRobotStrings.VK_W
    - typings.kbmRobot.kbmRobotStrings.VK_X
    - typings.kbmRobot.kbmRobotStrings.VK_Y
    - typings.kbmRobot.kbmRobotStrings.VK_Z
    - typings.kbmRobot.kbmRobotStrings.VK_OPEN_BRACKET
    - typings.kbmRobot.kbmRobotStrings.VK_BACK_SLASH
    - typings.kbmRobot.kbmRobotStrings.VK_CLOSE_BRACKET
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD0
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD1
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD2
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD3
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD4
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD5
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD6
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD7
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD8
    - typings.kbmRobot.kbmRobotStrings.VK_NUMPAD9
    - typings.kbmRobot.kbmRobotStrings.VK_MULTIPLY
    - typings.kbmRobot.kbmRobotStrings.VK_ADD
    - typings.kbmRobot.kbmRobotStrings.VK_SEPARATER
    - typings.kbmRobot.kbmRobotStrings.VK_SEPARATOR
    - typings.kbmRobot.kbmRobotStrings.VK_SUBTRACT
    - typings.kbmRobot.kbmRobotStrings.VK_DECIMAL
    - typings.kbmRobot.kbmRobotStrings.VK_DIVIDE
    - typings.kbmRobot.kbmRobotStrings.VK_DELETE
    - typings.kbmRobot.kbmRobotStrings.VK_NUM_LOCK
    - typings.kbmRobot.kbmRobotStrings.VK_SCROLL_LOCK
    - typings.kbmRobot.kbmRobotStrings.VK_F1
    - typings.kbmRobot.kbmRobotStrings.VK_F2
    - typings.kbmRobot.kbmRobotStrings.VK_F3
    - typings.kbmRobot.kbmRobotStrings.VK_F4
    - typings.kbmRobot.kbmRobotStrings.VK_F5
    - typings.kbmRobot.kbmRobotStrings.VK_F6
    - typings.kbmRobot.kbmRobotStrings.VK_F7
    - typings.kbmRobot.kbmRobotStrings.VK_F8
    - typings.kbmRobot.kbmRobotStrings.VK_F9
    - typings.kbmRobot.kbmRobotStrings.VK_F10
    - typings.kbmRobot.kbmRobotStrings.VK_F11
    - typings.kbmRobot.kbmRobotStrings.VK_F12
    - typings.kbmRobot.kbmRobotStrings.VK_F13
    - typings.kbmRobot.kbmRobotStrings.VK_F14
    - typings.kbmRobot.kbmRobotStrings.VK_F15
    - typings.kbmRobot.kbmRobotStrings.VK_F16
    - typings.kbmRobot.kbmRobotStrings.VK_F17
    - typings.kbmRobot.kbmRobotStrings.VK_F18
    - typings.kbmRobot.kbmRobotStrings.VK_F19
    - typings.kbmRobot.kbmRobotStrings.VK_F20
    - typings.kbmRobot.kbmRobotStrings.VK_F21
    - typings.kbmRobot.kbmRobotStrings.VK_F22
    - typings.kbmRobot.kbmRobotStrings.VK_F23
    - typings.kbmRobot.kbmRobotStrings.VK_F24
    - typings.kbmRobot.kbmRobotStrings.VK_PRINTSCREEN
    - typings.kbmRobot.kbmRobotStrings.VK_INSERT
    - typings.kbmRobot.kbmRobotStrings.VK_HELP
    - typings.kbmRobot.kbmRobotStrings.VK_META
    - typings.kbmRobot.kbmRobotStrings.VK_BACK_QUOTE
    - typings.kbmRobot.kbmRobotStrings.VK_QUOTE
    - typings.kbmRobot.kbmRobotStrings.VK_KP_UP
    - typings.kbmRobot.kbmRobotStrings.VK_KP_DOWN
    - typings.kbmRobot.kbmRobotStrings.VK_KP_LEFT
    - typings.kbmRobot.kbmRobotStrings.VK_KP_RIGHT
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_GRAVE
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_ACUTE
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_CIRCUMFLEX
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_TILDE
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_MACRON
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_BREVE
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVEDOT
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_DIAERESIS
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVERING
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_DOUBLEACUTE
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_CARON
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_CEDILLA
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_OGONEK
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_IOTA
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_VOICED_SOUND
    - typings.kbmRobot.kbmRobotStrings.VK_DEAD_SEMIVOICED_SOUND
    - typings.kbmRobot.kbmRobotStrings.VK_AMPERSAND
    - typings.kbmRobot.kbmRobotStrings.VK_ASTERISK
    - typings.kbmRobot.kbmRobotStrings.VK_QUOTEDBL
    - typings.kbmRobot.kbmRobotStrings.VK_LESS
    - typings.kbmRobot.kbmRobotStrings.VK_GREATER
    - typings.kbmRobot.kbmRobotStrings.VK_BRACELEFT
    - typings.kbmRobot.kbmRobotStrings.VK_BRACERIGHT
    - typings.kbmRobot.kbmRobotStrings.VK_AT
    - typings.kbmRobot.kbmRobotStrings.VK_COLON
    - typings.kbmRobot.kbmRobotStrings.VK_CIRCUMFLEX
    - typings.kbmRobot.kbmRobotStrings.VK_DOLLAR
    - typings.kbmRobot.kbmRobotStrings.VK_EURO_SIGN
    - typings.kbmRobot.kbmRobotStrings.VK_EXCLAMATION_MARK
    - typings.kbmRobot.kbmRobotStrings.VK_INVERTED_EXCLAMATION_MARK
    - typings.kbmRobot.kbmRobotStrings.VK_LEFT_PARENTHESIS
    - typings.kbmRobot.kbmRobotStrings.VK_NUMBER_SIGN
    - typings.kbmRobot.kbmRobotStrings.VK_PLUS
    - typings.kbmRobot.kbmRobotStrings.VK_RIGHT_PARENTHESIS
    - typings.kbmRobot.kbmRobotStrings.VK_UNDERSCORE
    - typings.kbmRobot.kbmRobotStrings.VK_WINDOWS
    - typings.kbmRobot.kbmRobotStrings.VK_CONTEXT_MENU
    - typings.kbmRobot.kbmRobotStrings.VK_FINAL
    - typings.kbmRobot.kbmRobotStrings.VK_CONVERT
    - typings.kbmRobot.kbmRobotStrings.VK_NONCONVERT
    - typings.kbmRobot.kbmRobotStrings.VK_ACCEPT
    - typings.kbmRobot.kbmRobotStrings.VK_MODECHANGE
    - typings.kbmRobot.kbmRobotStrings.VK_KANA
    - typings.kbmRobot.kbmRobotStrings.VK_KANJI
    - typings.kbmRobot.kbmRobotStrings.VK_ALPHANUMERIC
    - typings.kbmRobot.kbmRobotStrings.VK_KATAKANA
    - typings.kbmRobot.kbmRobotStrings.VK_HIRAGANA
    - typings.kbmRobot.kbmRobotStrings.VK_FULL_WIDTH
    - typings.kbmRobot.kbmRobotStrings.VK_HALF_WIDTH
    - typings.kbmRobot.kbmRobotStrings.VK_ROMAN_CHARACTERS
    - typings.kbmRobot.kbmRobotStrings.VK_ALL_CANDIDATES
    - typings.kbmRobot.kbmRobotStrings.VK_PREVIOUS_CANDIDATE
    - typings.kbmRobot.kbmRobotStrings.VK_CODE_INPUT
    - typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_KATAKANA
    - typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_HIRAGANA
    - typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_ROMAN
    - typings.kbmRobot.kbmRobotStrings.VK_KANA_LOCK
    - typings.kbmRobot.kbmRobotStrings.VK_INPUT_METHOD_ON_OFF
    - typings.kbmRobot.kbmRobotStrings.VK_CUT
    - typings.kbmRobot.kbmRobotStrings.VK_COPY
    - typings.kbmRobot.kbmRobotStrings.VK_PASTE
    - typings.kbmRobot.kbmRobotStrings.VK_UNDO
    - typings.kbmRobot.kbmRobotStrings.VK_AGAIN
    - typings.kbmRobot.kbmRobotStrings.VK_FIND
    - typings.kbmRobot.kbmRobotStrings.VK_PROPS
    - typings.kbmRobot.kbmRobotStrings.VK_STOP
    - typings.kbmRobot.kbmRobotStrings.VK_COMPOSE
    - typings.kbmRobot.kbmRobotStrings.VK_ALT_GRAPH
    - typings.kbmRobot.kbmRobotStrings.VK_BEGIN
    - typings.kbmRobot.kbmRobotStrings.VK_UNDEFINED
    - typings.kbmRobot.kbmRobotStrings.ESC
    - typings.kbmRobot.kbmRobotStrings.F1
    - typings.kbmRobot.kbmRobotStrings.F2
    - typings.kbmRobot.kbmRobotStrings.F3
    - typings.kbmRobot.kbmRobotStrings.F4
    - typings.kbmRobot.kbmRobotStrings.F5
    - typings.kbmRobot.kbmRobotStrings.F6
    - typings.kbmRobot.kbmRobotStrings.F7
    - typings.kbmRobot.kbmRobotStrings.F8
    - typings.kbmRobot.kbmRobotStrings.F9
    - typings.kbmRobot.kbmRobotStrings.F10
    - typings.kbmRobot.kbmRobotStrings.F11
    - typings.kbmRobot.kbmRobotStrings.F12
    - typings.kbmRobot.kbmRobotStrings.CTRL
    - typings.kbmRobot.kbmRobotStrings.META
    - typings.kbmRobot.kbmRobotStrings.SUPER
    - typings.kbmRobot.kbmRobotStrings.ALT
    - typings.kbmRobot.kbmRobotStrings.Space
    - typings.kbmRobot.kbmRobotStrings.SPACE
    - typings.kbmRobot.kbmRobotStrings.LEFT
    - typings.kbmRobot.kbmRobotStrings.DOWN
    - typings.kbmRobot.kbmRobotStrings.RIGHT
    - typings.kbmRobot.kbmRobotStrings.UP
    - typings.kbmRobot.kbmRobotStrings.TAB
    - typings.kbmRobot.kbmRobotStrings.SHIFT
    - typings.kbmRobot.kbmRobotStrings.ENTER
    - typings.kbmRobot.kbmRobotStrings.Linefeed
    - typings.kbmRobot.kbmRobotStrings.CAPS_LOCK
    - typings.kbmRobot.kbmRobotStrings.PRINT_SCREEN
    - typings.kbmRobot.kbmRobotStrings.SCROLL_LOCK
    - typings.kbmRobot.kbmRobotStrings.PAUSE_BREAK
    - typings.kbmRobot.kbmRobotStrings.BACKSPACE
    - typings.kbmRobot.kbmRobotStrings.DELETE
    - typings.kbmRobot.kbmRobotStrings.HOME
    - typings.kbmRobot.kbmRobotStrings.END
    - typings.kbmRobot.kbmRobotStrings.INSERT
    - typings.kbmRobot.kbmRobotStrings.PAGE_UP
    - typings.kbmRobot.kbmRobotStrings.PAGE_DOWN
    - typings.kbmRobot.kbmRobotStrings.NUM_LOCK
    - typings.kbmRobot.kbmRobotStrings.Graveaccent
    - typings.kbmRobot.kbmRobotStrings.`-_`
    - typings.kbmRobot.kbmRobotStrings.Equalssign
    - typings.kbmRobot.kbmRobotStrings.`[`
    - typings.kbmRobot.kbmRobotStrings.`]`
    - typings.kbmRobot.kbmRobotStrings.Backslash
    - typings.kbmRobot.kbmRobotStrings.Semicolon
    - typings.kbmRobot.kbmRobotStrings.Apostrophe
    - typings.kbmRobot.kbmRobotStrings.Comma
    - typings.kbmRobot.kbmRobotStrings.Dot
    - typings.kbmRobot.kbmRobotStrings.Slash
    - typings.kbmRobot.kbmRobotStrings.KP_ADD
    - typings.kbmRobot.kbmRobotStrings.`KP_-`
    - typings.kbmRobot.kbmRobotStrings.KP_Asterisk
    - typings.kbmRobot.kbmRobotStrings.KP_Slash
    - typings.kbmRobot.kbmRobotStrings.KP_0
    - typings.kbmRobot.kbmRobotStrings.KP_Dot
    - typings.kbmRobot.kbmRobotStrings.KP_1
    - typings.kbmRobot.kbmRobotStrings.KP_2
    - typings.kbmRobot.kbmRobotStrings.KP_3
    - typings.kbmRobot.kbmRobotStrings.KP_4
    - typings.kbmRobot.kbmRobotStrings.KP_5
    - typings.kbmRobot.kbmRobotStrings.KP_6
    - typings.kbmRobot.kbmRobotStrings.KP_7
    - typings.kbmRobot.kbmRobotStrings.KP_8
    - typings.kbmRobot.kbmRobotStrings.KP_9
  */
  trait Key extends StObject
  object Key {
    
    inline def ALT: typings.kbmRobot.kbmRobotStrings.ALT = "ALT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.ALT]
    
    inline def Apostrophe: typings.kbmRobot.kbmRobotStrings.Apostrophe = "'".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Apostrophe]
    
    inline def BACKSPACE: typings.kbmRobot.kbmRobotStrings.BACKSPACE = "BACKSPACE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.BACKSPACE]
    
    inline def Backslash: typings.kbmRobot.kbmRobotStrings.Backslash = "\\".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Backslash]
    
    inline def CAPS_LOCK: typings.kbmRobot.kbmRobotStrings.CAPS_LOCK = "CAPS_LOCK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.CAPS_LOCK]
    
    inline def CTRL: typings.kbmRobot.kbmRobotStrings.CTRL = "CTRL".asInstanceOf[typings.kbmRobot.kbmRobotStrings.CTRL]
    
    inline def Comma: typings.kbmRobot.kbmRobotStrings.Comma = ",".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Comma]
    
    inline def DELETE: typings.kbmRobot.kbmRobotStrings.DELETE = "DELETE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.DELETE]
    
    inline def DOWN: typings.kbmRobot.kbmRobotStrings.DOWN = "DOWN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.DOWN]
    
    inline def Dot: typings.kbmRobot.kbmRobotStrings.Dot = ".".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Dot]
    
    inline def END: typings.kbmRobot.kbmRobotStrings.END = "END".asInstanceOf[typings.kbmRobot.kbmRobotStrings.END]
    
    inline def ENTER: typings.kbmRobot.kbmRobotStrings.ENTER = "ENTER".asInstanceOf[typings.kbmRobot.kbmRobotStrings.ENTER]
    
    inline def ESC: typings.kbmRobot.kbmRobotStrings.ESC = "ESC".asInstanceOf[typings.kbmRobot.kbmRobotStrings.ESC]
    
    inline def Equalssign: typings.kbmRobot.kbmRobotStrings.Equalssign = "=".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Equalssign]
    
    inline def F1: typings.kbmRobot.kbmRobotStrings.F1 = "F1".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F1]
    
    inline def F10: typings.kbmRobot.kbmRobotStrings.F10 = "F10".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F10]
    
    inline def F11: typings.kbmRobot.kbmRobotStrings.F11 = "F11".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F11]
    
    inline def F12: typings.kbmRobot.kbmRobotStrings.F12 = "F12".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F12]
    
    inline def F2: typings.kbmRobot.kbmRobotStrings.F2 = "F2".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F2]
    
    inline def F3: typings.kbmRobot.kbmRobotStrings.F3 = "F3".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F3]
    
    inline def F4: typings.kbmRobot.kbmRobotStrings.F4 = "F4".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F4]
    
    inline def F5: typings.kbmRobot.kbmRobotStrings.F5 = "F5".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F5]
    
    inline def F6: typings.kbmRobot.kbmRobotStrings.F6 = "F6".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F6]
    
    inline def F7: typings.kbmRobot.kbmRobotStrings.F7 = "F7".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F7]
    
    inline def F8: typings.kbmRobot.kbmRobotStrings.F8 = "F8".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F8]
    
    inline def F9: typings.kbmRobot.kbmRobotStrings.F9 = "F9".asInstanceOf[typings.kbmRobot.kbmRobotStrings.F9]
    
    inline def Graveaccent: typings.kbmRobot.kbmRobotStrings.Graveaccent = "`".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Graveaccent]
    
    inline def HOME: typings.kbmRobot.kbmRobotStrings.HOME = "HOME".asInstanceOf[typings.kbmRobot.kbmRobotStrings.HOME]
    
    inline def INSERT: typings.kbmRobot.kbmRobotStrings.INSERT = "INSERT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.INSERT]
    
    inline def `KP_-`: typings.kbmRobot.kbmRobotStrings.`KP_-` = "KP_-".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`KP_-`]
    
    inline def KP_0: typings.kbmRobot.kbmRobotStrings.KP_0 = "KP_0".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_0]
    
    inline def KP_1: typings.kbmRobot.kbmRobotStrings.KP_1 = "KP_1".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_1]
    
    inline def KP_2: typings.kbmRobot.kbmRobotStrings.KP_2 = "KP_2".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_2]
    
    inline def KP_3: typings.kbmRobot.kbmRobotStrings.KP_3 = "KP_3".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_3]
    
    inline def KP_4: typings.kbmRobot.kbmRobotStrings.KP_4 = "KP_4".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_4]
    
    inline def KP_5: typings.kbmRobot.kbmRobotStrings.KP_5 = "KP_5".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_5]
    
    inline def KP_6: typings.kbmRobot.kbmRobotStrings.KP_6 = "KP_6".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_6]
    
    inline def KP_7: typings.kbmRobot.kbmRobotStrings.KP_7 = "KP_7".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_7]
    
    inline def KP_8: typings.kbmRobot.kbmRobotStrings.KP_8 = "KP_8".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_8]
    
    inline def KP_9: typings.kbmRobot.kbmRobotStrings.KP_9 = "KP_9".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_9]
    
    inline def KP_ADD: typings.kbmRobot.kbmRobotStrings.KP_ADD = "KP_ADD".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_ADD]
    
    inline def KP_Asterisk: typings.kbmRobot.kbmRobotStrings.KP_Asterisk = "KP_*".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_Asterisk]
    
    inline def KP_Dot: typings.kbmRobot.kbmRobotStrings.KP_Dot = "KP_.".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_Dot]
    
    inline def KP_Slash: typings.kbmRobot.kbmRobotStrings.KP_Slash = "KP_/".asInstanceOf[typings.kbmRobot.kbmRobotStrings.KP_Slash]
    
    inline def LEFT: typings.kbmRobot.kbmRobotStrings.LEFT = "LEFT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.LEFT]
    
    inline def Linefeed: typings.kbmRobot.kbmRobotStrings.Linefeed = "\n".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Linefeed]
    
    inline def META: typings.kbmRobot.kbmRobotStrings.META = "META".asInstanceOf[typings.kbmRobot.kbmRobotStrings.META]
    
    inline def NUM_LOCK: typings.kbmRobot.kbmRobotStrings.NUM_LOCK = "NUM_LOCK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.NUM_LOCK]
    
    inline def PAGE_DOWN: typings.kbmRobot.kbmRobotStrings.PAGE_DOWN = "PAGE_DOWN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.PAGE_DOWN]
    
    inline def PAGE_UP: typings.kbmRobot.kbmRobotStrings.PAGE_UP = "PAGE_UP".asInstanceOf[typings.kbmRobot.kbmRobotStrings.PAGE_UP]
    
    inline def PAUSE_BREAK: typings.kbmRobot.kbmRobotStrings.PAUSE_BREAK = "PAUSE_BREAK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.PAUSE_BREAK]
    
    inline def PRINT_SCREEN: typings.kbmRobot.kbmRobotStrings.PRINT_SCREEN = "PRINT_SCREEN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.PRINT_SCREEN]
    
    inline def RIGHT: typings.kbmRobot.kbmRobotStrings.RIGHT = "RIGHT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.RIGHT]
    
    inline def SCROLL_LOCK: typings.kbmRobot.kbmRobotStrings.SCROLL_LOCK = "SCROLL_LOCK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.SCROLL_LOCK]
    
    inline def SHIFT: typings.kbmRobot.kbmRobotStrings.SHIFT = "SHIFT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.SHIFT]
    
    inline def SPACE: typings.kbmRobot.kbmRobotStrings.SPACE = "SPACE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.SPACE]
    
    inline def SUPER: typings.kbmRobot.kbmRobotStrings.SUPER = "SUPER".asInstanceOf[typings.kbmRobot.kbmRobotStrings.SUPER]
    
    inline def Semicolon: typings.kbmRobot.kbmRobotStrings.Semicolon = ";".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Semicolon]
    
    inline def Slash: typings.kbmRobot.kbmRobotStrings.Slash = "/".asInstanceOf[typings.kbmRobot.kbmRobotStrings.Slash]
    
    inline def Space: typings.kbmRobot.kbmRobotStrings.Space = (" ").asInstanceOf[typings.kbmRobot.kbmRobotStrings.Space]
    
    inline def TAB: typings.kbmRobot.kbmRobotStrings.TAB = "TAB".asInstanceOf[typings.kbmRobot.kbmRobotStrings.TAB]
    
    inline def UP: typings.kbmRobot.kbmRobotStrings.UP = "UP".asInstanceOf[typings.kbmRobot.kbmRobotStrings.UP]
    
    inline def VK_0: typings.kbmRobot.kbmRobotStrings.VK_0 = "VK_0".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_0]
    
    inline def VK_1: typings.kbmRobot.kbmRobotStrings.VK_1 = "VK_1".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_1]
    
    inline def VK_2: typings.kbmRobot.kbmRobotStrings.VK_2 = "VK_2".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_2]
    
    inline def VK_3: typings.kbmRobot.kbmRobotStrings.VK_3 = "VK_3".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_3]
    
    inline def VK_4: typings.kbmRobot.kbmRobotStrings.VK_4 = "VK_4".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_4]
    
    inline def VK_5: typings.kbmRobot.kbmRobotStrings.VK_5 = "VK_5".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_5]
    
    inline def VK_6: typings.kbmRobot.kbmRobotStrings.VK_6 = "VK_6".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_6]
    
    inline def VK_7: typings.kbmRobot.kbmRobotStrings.VK_7 = "VK_7".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_7]
    
    inline def VK_8: typings.kbmRobot.kbmRobotStrings.VK_8 = "VK_8".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_8]
    
    inline def VK_9: typings.kbmRobot.kbmRobotStrings.VK_9 = "VK_9".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_9]
    
    inline def VK_A: typings.kbmRobot.kbmRobotStrings.VK_A = "VK_A".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_A]
    
    inline def VK_ACCEPT: typings.kbmRobot.kbmRobotStrings.VK_ACCEPT = "VK_ACCEPT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ACCEPT]
    
    inline def VK_ADD: typings.kbmRobot.kbmRobotStrings.VK_ADD = "VK_ADD".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ADD]
    
    inline def VK_AGAIN: typings.kbmRobot.kbmRobotStrings.VK_AGAIN = "VK_AGAIN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_AGAIN]
    
    inline def VK_ALL_CANDIDATES: typings.kbmRobot.kbmRobotStrings.VK_ALL_CANDIDATES = "VK_ALL_CANDIDATES".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ALL_CANDIDATES]
    
    inline def VK_ALPHANUMERIC: typings.kbmRobot.kbmRobotStrings.VK_ALPHANUMERIC = "VK_ALPHANUMERIC".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ALPHANUMERIC]
    
    inline def VK_ALT: typings.kbmRobot.kbmRobotStrings.VK_ALT = "VK_ALT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ALT]
    
    inline def VK_ALT_GRAPH: typings.kbmRobot.kbmRobotStrings.VK_ALT_GRAPH = "VK_ALT_GRAPH".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ALT_GRAPH]
    
    inline def VK_AMPERSAND: typings.kbmRobot.kbmRobotStrings.VK_AMPERSAND = "VK_AMPERSAND".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_AMPERSAND]
    
    inline def VK_ASTERISK: typings.kbmRobot.kbmRobotStrings.VK_ASTERISK = "VK_ASTERISK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ASTERISK]
    
    inline def VK_AT: typings.kbmRobot.kbmRobotStrings.VK_AT = "VK_AT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_AT]
    
    inline def VK_B: typings.kbmRobot.kbmRobotStrings.VK_B = "VK_B".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_B]
    
    inline def VK_BACK_QUOTE: typings.kbmRobot.kbmRobotStrings.VK_BACK_QUOTE = "VK_BACK_QUOTE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_BACK_QUOTE]
    
    inline def VK_BACK_SLASH: typings.kbmRobot.kbmRobotStrings.VK_BACK_SLASH = "VK_BACK_SLASH".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_BACK_SLASH]
    
    inline def VK_BACK_SPACE: typings.kbmRobot.kbmRobotStrings.VK_BACK_SPACE = "VK_BACK_SPACE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_BACK_SPACE]
    
    inline def VK_BEGIN: typings.kbmRobot.kbmRobotStrings.VK_BEGIN = "VK_BEGIN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_BEGIN]
    
    inline def VK_BRACELEFT: typings.kbmRobot.kbmRobotStrings.VK_BRACELEFT = "VK_BRACELEFT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_BRACELEFT]
    
    inline def VK_BRACERIGHT: typings.kbmRobot.kbmRobotStrings.VK_BRACERIGHT = "VK_BRACERIGHT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_BRACERIGHT]
    
    inline def VK_C: typings.kbmRobot.kbmRobotStrings.VK_C = "VK_C".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_C]
    
    inline def VK_CANCEL: typings.kbmRobot.kbmRobotStrings.VK_CANCEL = "VK_CANCEL".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CANCEL]
    
    inline def VK_CAPS_LOCK: typings.kbmRobot.kbmRobotStrings.VK_CAPS_LOCK = "VK_CAPS_LOCK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CAPS_LOCK]
    
    inline def VK_CIRCUMFLEX: typings.kbmRobot.kbmRobotStrings.VK_CIRCUMFLEX = "VK_CIRCUMFLEX".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CIRCUMFLEX]
    
    inline def VK_CLEAR: typings.kbmRobot.kbmRobotStrings.VK_CLEAR = "VK_CLEAR".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CLEAR]
    
    inline def VK_CLOSE_BRACKET: typings.kbmRobot.kbmRobotStrings.VK_CLOSE_BRACKET = "VK_CLOSE_BRACKET".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CLOSE_BRACKET]
    
    inline def VK_CODE_INPUT: typings.kbmRobot.kbmRobotStrings.VK_CODE_INPUT = "VK_CODE_INPUT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CODE_INPUT]
    
    inline def VK_COLON: typings.kbmRobot.kbmRobotStrings.VK_COLON = "VK_COLON".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_COLON]
    
    inline def VK_COMMA: typings.kbmRobot.kbmRobotStrings.VK_COMMA = "VK_COMMA".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_COMMA]
    
    inline def VK_COMPOSE: typings.kbmRobot.kbmRobotStrings.VK_COMPOSE = "VK_COMPOSE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_COMPOSE]
    
    inline def VK_CONTEXT_MENU: typings.kbmRobot.kbmRobotStrings.VK_CONTEXT_MENU = "VK_CONTEXT_MENU".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CONTEXT_MENU]
    
    inline def VK_CONTROL: typings.kbmRobot.kbmRobotStrings.VK_CONTROL = "VK_CONTROL".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CONTROL]
    
    inline def VK_CONVERT: typings.kbmRobot.kbmRobotStrings.VK_CONVERT = "VK_CONVERT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CONVERT]
    
    inline def VK_COPY: typings.kbmRobot.kbmRobotStrings.VK_COPY = "VK_COPY".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_COPY]
    
    inline def VK_CUT: typings.kbmRobot.kbmRobotStrings.VK_CUT = "VK_CUT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_CUT]
    
    inline def VK_D: typings.kbmRobot.kbmRobotStrings.VK_D = "VK_D".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_D]
    
    inline def VK_DEAD_ABOVEDOT: typings.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVEDOT = "VK_DEAD_ABOVEDOT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVEDOT]
    
    inline def VK_DEAD_ABOVERING: typings.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVERING = "VK_DEAD_ABOVERING".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVERING]
    
    inline def VK_DEAD_ACUTE: typings.kbmRobot.kbmRobotStrings.VK_DEAD_ACUTE = "VK_DEAD_ACUTE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_ACUTE]
    
    inline def VK_DEAD_BREVE: typings.kbmRobot.kbmRobotStrings.VK_DEAD_BREVE = "VK_DEAD_BREVE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_BREVE]
    
    inline def VK_DEAD_CARON: typings.kbmRobot.kbmRobotStrings.VK_DEAD_CARON = "VK_DEAD_CARON".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_CARON]
    
    inline def VK_DEAD_CEDILLA: typings.kbmRobot.kbmRobotStrings.VK_DEAD_CEDILLA = "VK_DEAD_CEDILLA".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_CEDILLA]
    
    inline def VK_DEAD_CIRCUMFLEX: typings.kbmRobot.kbmRobotStrings.VK_DEAD_CIRCUMFLEX = "VK_DEAD_CIRCUMFLEX".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_CIRCUMFLEX]
    
    inline def VK_DEAD_DIAERESIS: typings.kbmRobot.kbmRobotStrings.VK_DEAD_DIAERESIS = "VK_DEAD_DIAERESIS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_DIAERESIS]
    
    inline def VK_DEAD_DOUBLEACUTE: typings.kbmRobot.kbmRobotStrings.VK_DEAD_DOUBLEACUTE = "VK_DEAD_DOUBLEACUTE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_DOUBLEACUTE]
    
    inline def VK_DEAD_GRAVE: typings.kbmRobot.kbmRobotStrings.VK_DEAD_GRAVE = "VK_DEAD_GRAVE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_GRAVE]
    
    inline def VK_DEAD_IOTA: typings.kbmRobot.kbmRobotStrings.VK_DEAD_IOTA = "VK_DEAD_IOTA".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_IOTA]
    
    inline def VK_DEAD_MACRON: typings.kbmRobot.kbmRobotStrings.VK_DEAD_MACRON = "VK_DEAD_MACRON".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_MACRON]
    
    inline def VK_DEAD_OGONEK: typings.kbmRobot.kbmRobotStrings.VK_DEAD_OGONEK = "VK_DEAD_OGONEK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_OGONEK]
    
    inline def VK_DEAD_SEMIVOICED_SOUND: typings.kbmRobot.kbmRobotStrings.VK_DEAD_SEMIVOICED_SOUND = "VK_DEAD_SEMIVOICED_SOUND".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_SEMIVOICED_SOUND]
    
    inline def VK_DEAD_TILDE: typings.kbmRobot.kbmRobotStrings.VK_DEAD_TILDE = "VK_DEAD_TILDE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_TILDE]
    
    inline def VK_DEAD_VOICED_SOUND: typings.kbmRobot.kbmRobotStrings.VK_DEAD_VOICED_SOUND = "VK_DEAD_VOICED_SOUND".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DEAD_VOICED_SOUND]
    
    inline def VK_DECIMAL: typings.kbmRobot.kbmRobotStrings.VK_DECIMAL = "VK_DECIMAL".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DECIMAL]
    
    inline def VK_DELETE: typings.kbmRobot.kbmRobotStrings.VK_DELETE = "VK_DELETE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DELETE]
    
    inline def VK_DIVIDE: typings.kbmRobot.kbmRobotStrings.VK_DIVIDE = "VK_DIVIDE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DIVIDE]
    
    inline def VK_DOLLAR: typings.kbmRobot.kbmRobotStrings.VK_DOLLAR = "VK_DOLLAR".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DOLLAR]
    
    inline def VK_DOWN: typings.kbmRobot.kbmRobotStrings.VK_DOWN = "VK_DOWN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_DOWN]
    
    inline def VK_E: typings.kbmRobot.kbmRobotStrings.VK_E = "VK_E".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_E]
    
    inline def VK_END: typings.kbmRobot.kbmRobotStrings.VK_END = "VK_END".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_END]
    
    inline def VK_ENTER: typings.kbmRobot.kbmRobotStrings.VK_ENTER = "VK_ENTER".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ENTER]
    
    inline def VK_EQUALS: typings.kbmRobot.kbmRobotStrings.VK_EQUALS = "VK_EQUALS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_EQUALS]
    
    inline def VK_ESCAPE: typings.kbmRobot.kbmRobotStrings.VK_ESCAPE = "VK_ESCAPE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ESCAPE]
    
    inline def VK_EURO_SIGN: typings.kbmRobot.kbmRobotStrings.VK_EURO_SIGN = "VK_EURO_SIGN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_EURO_SIGN]
    
    inline def VK_EXCLAMATION_MARK: typings.kbmRobot.kbmRobotStrings.VK_EXCLAMATION_MARK = "VK_EXCLAMATION_MARK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_EXCLAMATION_MARK]
    
    inline def VK_F: typings.kbmRobot.kbmRobotStrings.VK_F = "VK_F".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F]
    
    inline def VK_F1: typings.kbmRobot.kbmRobotStrings.VK_F1 = "VK_F1".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F1]
    
    inline def VK_F10: typings.kbmRobot.kbmRobotStrings.VK_F10 = "VK_F10".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F10]
    
    inline def VK_F11: typings.kbmRobot.kbmRobotStrings.VK_F11 = "VK_F11".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F11]
    
    inline def VK_F12: typings.kbmRobot.kbmRobotStrings.VK_F12 = "VK_F12".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F12]
    
    inline def VK_F13: typings.kbmRobot.kbmRobotStrings.VK_F13 = "VK_F13".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F13]
    
    inline def VK_F14: typings.kbmRobot.kbmRobotStrings.VK_F14 = "VK_F14".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F14]
    
    inline def VK_F15: typings.kbmRobot.kbmRobotStrings.VK_F15 = "VK_F15".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F15]
    
    inline def VK_F16: typings.kbmRobot.kbmRobotStrings.VK_F16 = "VK_F16".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F16]
    
    inline def VK_F17: typings.kbmRobot.kbmRobotStrings.VK_F17 = "VK_F17".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F17]
    
    inline def VK_F18: typings.kbmRobot.kbmRobotStrings.VK_F18 = "VK_F18".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F18]
    
    inline def VK_F19: typings.kbmRobot.kbmRobotStrings.VK_F19 = "VK_F19".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F19]
    
    inline def VK_F2: typings.kbmRobot.kbmRobotStrings.VK_F2 = "VK_F2".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F2]
    
    inline def VK_F20: typings.kbmRobot.kbmRobotStrings.VK_F20 = "VK_F20".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F20]
    
    inline def VK_F21: typings.kbmRobot.kbmRobotStrings.VK_F21 = "VK_F21".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F21]
    
    inline def VK_F22: typings.kbmRobot.kbmRobotStrings.VK_F22 = "VK_F22".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F22]
    
    inline def VK_F23: typings.kbmRobot.kbmRobotStrings.VK_F23 = "VK_F23".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F23]
    
    inline def VK_F24: typings.kbmRobot.kbmRobotStrings.VK_F24 = "VK_F24".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F24]
    
    inline def VK_F3: typings.kbmRobot.kbmRobotStrings.VK_F3 = "VK_F3".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F3]
    
    inline def VK_F4: typings.kbmRobot.kbmRobotStrings.VK_F4 = "VK_F4".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F4]
    
    inline def VK_F5: typings.kbmRobot.kbmRobotStrings.VK_F5 = "VK_F5".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F5]
    
    inline def VK_F6: typings.kbmRobot.kbmRobotStrings.VK_F6 = "VK_F6".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F6]
    
    inline def VK_F7: typings.kbmRobot.kbmRobotStrings.VK_F7 = "VK_F7".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F7]
    
    inline def VK_F8: typings.kbmRobot.kbmRobotStrings.VK_F8 = "VK_F8".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F8]
    
    inline def VK_F9: typings.kbmRobot.kbmRobotStrings.VK_F9 = "VK_F9".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_F9]
    
    inline def VK_FINAL: typings.kbmRobot.kbmRobotStrings.VK_FINAL = "VK_FINAL".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_FINAL]
    
    inline def VK_FIND: typings.kbmRobot.kbmRobotStrings.VK_FIND = "VK_FIND".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_FIND]
    
    inline def VK_FULL_WIDTH: typings.kbmRobot.kbmRobotStrings.VK_FULL_WIDTH = "VK_FULL_WIDTH".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_FULL_WIDTH]
    
    inline def VK_G: typings.kbmRobot.kbmRobotStrings.VK_G = "VK_G".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_G]
    
    inline def VK_GREATER: typings.kbmRobot.kbmRobotStrings.VK_GREATER = "VK_GREATER".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_GREATER]
    
    inline def VK_H: typings.kbmRobot.kbmRobotStrings.VK_H = "VK_H".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_H]
    
    inline def VK_HALF_WIDTH: typings.kbmRobot.kbmRobotStrings.VK_HALF_WIDTH = "VK_HALF_WIDTH".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_HALF_WIDTH]
    
    inline def VK_HELP: typings.kbmRobot.kbmRobotStrings.VK_HELP = "VK_HELP".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_HELP]
    
    inline def VK_HIRAGANA: typings.kbmRobot.kbmRobotStrings.VK_HIRAGANA = "VK_HIRAGANA".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_HIRAGANA]
    
    inline def VK_HOME: typings.kbmRobot.kbmRobotStrings.VK_HOME = "VK_HOME".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_HOME]
    
    inline def VK_I: typings.kbmRobot.kbmRobotStrings.VK_I = "VK_I".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_I]
    
    inline def VK_INPUT_METHOD_ON_OFF: typings.kbmRobot.kbmRobotStrings.VK_INPUT_METHOD_ON_OFF = "VK_INPUT_METHOD_ON_OFF".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_INPUT_METHOD_ON_OFF]
    
    inline def VK_INSERT: typings.kbmRobot.kbmRobotStrings.VK_INSERT = "VK_INSERT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_INSERT]
    
    inline def VK_INVERTED_EXCLAMATION_MARK: typings.kbmRobot.kbmRobotStrings.VK_INVERTED_EXCLAMATION_MARK = "VK_INVERTED_EXCLAMATION_MARK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_INVERTED_EXCLAMATION_MARK]
    
    inline def VK_J: typings.kbmRobot.kbmRobotStrings.VK_J = "VK_J".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_J]
    
    inline def VK_JAPANESE_HIRAGANA: typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_HIRAGANA = "VK_JAPANESE_HIRAGANA".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_HIRAGANA]
    
    inline def VK_JAPANESE_KATAKANA: typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_KATAKANA = "VK_JAPANESE_KATAKANA".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_KATAKANA]
    
    inline def VK_JAPANESE_ROMAN: typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_ROMAN = "VK_JAPANESE_ROMAN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_JAPANESE_ROMAN]
    
    inline def VK_K: typings.kbmRobot.kbmRobotStrings.VK_K = "VK_K".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_K]
    
    inline def VK_KANA: typings.kbmRobot.kbmRobotStrings.VK_KANA = "VK_KANA".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_KANA]
    
    inline def VK_KANA_LOCK: typings.kbmRobot.kbmRobotStrings.VK_KANA_LOCK = "VK_KANA_LOCK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_KANA_LOCK]
    
    inline def VK_KANJI: typings.kbmRobot.kbmRobotStrings.VK_KANJI = "VK_KANJI".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_KANJI]
    
    inline def VK_KATAKANA: typings.kbmRobot.kbmRobotStrings.VK_KATAKANA = "VK_KATAKANA".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_KATAKANA]
    
    inline def VK_KP_DOWN: typings.kbmRobot.kbmRobotStrings.VK_KP_DOWN = "VK_KP_DOWN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_KP_DOWN]
    
    inline def VK_KP_LEFT: typings.kbmRobot.kbmRobotStrings.VK_KP_LEFT = "VK_KP_LEFT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_KP_LEFT]
    
    inline def VK_KP_RIGHT: typings.kbmRobot.kbmRobotStrings.VK_KP_RIGHT = "VK_KP_RIGHT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_KP_RIGHT]
    
    inline def VK_KP_UP: typings.kbmRobot.kbmRobotStrings.VK_KP_UP = "VK_KP_UP".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_KP_UP]
    
    inline def VK_L: typings.kbmRobot.kbmRobotStrings.VK_L = "VK_L".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_L]
    
    inline def VK_LEFT: typings.kbmRobot.kbmRobotStrings.VK_LEFT = "VK_LEFT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_LEFT]
    
    inline def VK_LEFT_PARENTHESIS: typings.kbmRobot.kbmRobotStrings.VK_LEFT_PARENTHESIS = "VK_LEFT_PARENTHESIS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_LEFT_PARENTHESIS]
    
    inline def VK_LESS: typings.kbmRobot.kbmRobotStrings.VK_LESS = "VK_LESS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_LESS]
    
    inline def VK_M: typings.kbmRobot.kbmRobotStrings.VK_M = "VK_M".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_M]
    
    inline def VK_META: typings.kbmRobot.kbmRobotStrings.VK_META = "VK_META".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_META]
    
    inline def VK_MINUS: typings.kbmRobot.kbmRobotStrings.VK_MINUS = "VK_MINUS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_MINUS]
    
    inline def VK_MODECHANGE: typings.kbmRobot.kbmRobotStrings.VK_MODECHANGE = "VK_MODECHANGE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_MODECHANGE]
    
    inline def VK_MULTIPLY: typings.kbmRobot.kbmRobotStrings.VK_MULTIPLY = "VK_MULTIPLY".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_MULTIPLY]
    
    inline def VK_N: typings.kbmRobot.kbmRobotStrings.VK_N = "VK_N".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_N]
    
    inline def VK_NONCONVERT: typings.kbmRobot.kbmRobotStrings.VK_NONCONVERT = "VK_NONCONVERT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NONCONVERT]
    
    inline def VK_NUMBER_SIGN: typings.kbmRobot.kbmRobotStrings.VK_NUMBER_SIGN = "VK_NUMBER_SIGN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMBER_SIGN]
    
    inline def VK_NUMPAD0: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD0 = "VK_NUMPAD0".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD0]
    
    inline def VK_NUMPAD1: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD1 = "VK_NUMPAD1".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD1]
    
    inline def VK_NUMPAD2: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD2 = "VK_NUMPAD2".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD2]
    
    inline def VK_NUMPAD3: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD3 = "VK_NUMPAD3".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD3]
    
    inline def VK_NUMPAD4: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD4 = "VK_NUMPAD4".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD4]
    
    inline def VK_NUMPAD5: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD5 = "VK_NUMPAD5".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD5]
    
    inline def VK_NUMPAD6: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD6 = "VK_NUMPAD6".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD6]
    
    inline def VK_NUMPAD7: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD7 = "VK_NUMPAD7".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD7]
    
    inline def VK_NUMPAD8: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD8 = "VK_NUMPAD8".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD8]
    
    inline def VK_NUMPAD9: typings.kbmRobot.kbmRobotStrings.VK_NUMPAD9 = "VK_NUMPAD9".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUMPAD9]
    
    inline def VK_NUM_LOCK: typings.kbmRobot.kbmRobotStrings.VK_NUM_LOCK = "VK_NUM_LOCK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_NUM_LOCK]
    
    inline def VK_O: typings.kbmRobot.kbmRobotStrings.VK_O = "VK_O".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_O]
    
    inline def VK_OPEN_BRACKET: typings.kbmRobot.kbmRobotStrings.VK_OPEN_BRACKET = "VK_OPEN_BRACKET".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_OPEN_BRACKET]
    
    inline def VK_P: typings.kbmRobot.kbmRobotStrings.VK_P = "VK_P".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_P]
    
    inline def VK_PAGE_DOWN: typings.kbmRobot.kbmRobotStrings.VK_PAGE_DOWN = "VK_PAGE_DOWN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PAGE_DOWN]
    
    inline def VK_PAGE_UP: typings.kbmRobot.kbmRobotStrings.VK_PAGE_UP = "VK_PAGE_UP".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PAGE_UP]
    
    inline def VK_PASTE: typings.kbmRobot.kbmRobotStrings.VK_PASTE = "VK_PASTE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PASTE]
    
    inline def VK_PAUSE: typings.kbmRobot.kbmRobotStrings.VK_PAUSE = "VK_PAUSE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PAUSE]
    
    inline def VK_PERIOD: typings.kbmRobot.kbmRobotStrings.VK_PERIOD = "VK_PERIOD".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PERIOD]
    
    inline def VK_PLUS: typings.kbmRobot.kbmRobotStrings.VK_PLUS = "VK_PLUS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PLUS]
    
    inline def VK_PREVIOUS_CANDIDATE: typings.kbmRobot.kbmRobotStrings.VK_PREVIOUS_CANDIDATE = "VK_PREVIOUS_CANDIDATE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PREVIOUS_CANDIDATE]
    
    inline def VK_PRINTSCREEN: typings.kbmRobot.kbmRobotStrings.VK_PRINTSCREEN = "VK_PRINTSCREEN".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PRINTSCREEN]
    
    inline def VK_PROPS: typings.kbmRobot.kbmRobotStrings.VK_PROPS = "VK_PROPS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_PROPS]
    
    inline def VK_Q: typings.kbmRobot.kbmRobotStrings.VK_Q = "VK_Q".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_Q]
    
    inline def VK_QUOTE: typings.kbmRobot.kbmRobotStrings.VK_QUOTE = "VK_QUOTE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_QUOTE]
    
    inline def VK_QUOTEDBL: typings.kbmRobot.kbmRobotStrings.VK_QUOTEDBL = "VK_QUOTEDBL".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_QUOTEDBL]
    
    inline def VK_R: typings.kbmRobot.kbmRobotStrings.VK_R = "VK_R".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_R]
    
    inline def VK_RIGHT: typings.kbmRobot.kbmRobotStrings.VK_RIGHT = "VK_RIGHT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_RIGHT]
    
    inline def VK_RIGHT_PARENTHESIS: typings.kbmRobot.kbmRobotStrings.VK_RIGHT_PARENTHESIS = "VK_RIGHT_PARENTHESIS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_RIGHT_PARENTHESIS]
    
    inline def VK_ROMAN_CHARACTERS: typings.kbmRobot.kbmRobotStrings.VK_ROMAN_CHARACTERS = "VK_ROMAN_CHARACTERS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_ROMAN_CHARACTERS]
    
    inline def VK_S: typings.kbmRobot.kbmRobotStrings.VK_S = "VK_S".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_S]
    
    inline def VK_SCROLL_LOCK: typings.kbmRobot.kbmRobotStrings.VK_SCROLL_LOCK = "VK_SCROLL_LOCK".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_SCROLL_LOCK]
    
    inline def VK_SEMICOLON: typings.kbmRobot.kbmRobotStrings.VK_SEMICOLON = "VK_SEMICOLON".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_SEMICOLON]
    
    inline def VK_SEPARATER: typings.kbmRobot.kbmRobotStrings.VK_SEPARATER = "VK_SEPARATER".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_SEPARATER]
    
    inline def VK_SEPARATOR: typings.kbmRobot.kbmRobotStrings.VK_SEPARATOR = "VK_SEPARATOR".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_SEPARATOR]
    
    inline def VK_SHIFT: typings.kbmRobot.kbmRobotStrings.VK_SHIFT = "VK_SHIFT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_SHIFT]
    
    inline def VK_SLASH: typings.kbmRobot.kbmRobotStrings.VK_SLASH = "VK_SLASH".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_SLASH]
    
    inline def VK_SPACE: typings.kbmRobot.kbmRobotStrings.VK_SPACE = "VK_SPACE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_SPACE]
    
    inline def VK_STOP: typings.kbmRobot.kbmRobotStrings.VK_STOP = "VK_STOP".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_STOP]
    
    inline def VK_SUBTRACT: typings.kbmRobot.kbmRobotStrings.VK_SUBTRACT = "VK_SUBTRACT".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_SUBTRACT]
    
    inline def VK_T: typings.kbmRobot.kbmRobotStrings.VK_T = "VK_T".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_T]
    
    inline def VK_TAB: typings.kbmRobot.kbmRobotStrings.VK_TAB = "VK_TAB".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_TAB]
    
    inline def VK_U: typings.kbmRobot.kbmRobotStrings.VK_U = "VK_U".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_U]
    
    inline def VK_UNDEFINED: typings.kbmRobot.kbmRobotStrings.VK_UNDEFINED = "VK_UNDEFINED".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_UNDEFINED]
    
    inline def VK_UNDERSCORE: typings.kbmRobot.kbmRobotStrings.VK_UNDERSCORE = "VK_UNDERSCORE".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_UNDERSCORE]
    
    inline def VK_UNDO: typings.kbmRobot.kbmRobotStrings.VK_UNDO = "VK_UNDO".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_UNDO]
    
    inline def VK_UP: typings.kbmRobot.kbmRobotStrings.VK_UP = "VK_UP".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_UP]
    
    inline def VK_V: typings.kbmRobot.kbmRobotStrings.VK_V = "VK_V".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_V]
    
    inline def VK_W: typings.kbmRobot.kbmRobotStrings.VK_W = "VK_W".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_W]
    
    inline def VK_WINDOWS: typings.kbmRobot.kbmRobotStrings.VK_WINDOWS = "VK_WINDOWS".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_WINDOWS]
    
    inline def VK_X: typings.kbmRobot.kbmRobotStrings.VK_X = "VK_X".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_X]
    
    inline def VK_Y: typings.kbmRobot.kbmRobotStrings.VK_Y = "VK_Y".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_Y]
    
    inline def VK_Z: typings.kbmRobot.kbmRobotStrings.VK_Z = "VK_Z".asInstanceOf[typings.kbmRobot.kbmRobotStrings.VK_Z]
    
    inline def `[`: typings.kbmRobot.kbmRobotStrings.`[` = "[".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`[`]
    
    inline def `]`: typings.kbmRobot.kbmRobotStrings.`]` = "]".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`]`]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.kbmRobot.kbmRobotStrings.DollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracket
    - typings.kbmRobot.kbmRobotStrings.DollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracket
    - typings.kbmRobot.kbmRobotStrings.`1`
    - typings.kbmRobot.kbmRobotStrings.`2`
    - typings.kbmRobot.kbmRobotStrings.`3`
  */
  trait MouseButton extends StObject
  object MouseButton {
    
    inline def `1`: typings.kbmRobot.kbmRobotStrings.`1` = "1".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`1`]
    
    inline def `2`: typings.kbmRobot.kbmRobotStrings.`2` = "2".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`2`]
    
    inline def `3`: typings.kbmRobot.kbmRobotStrings.`3` = "3".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`3`]
    
    inline def DollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracket: typings.kbmRobot.kbmRobotStrings.DollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracket = "${_MouseButton}${_MouseButton}".asInstanceOf[typings.kbmRobot.kbmRobotStrings.DollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracket]
    
    inline def DollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracket: typings.kbmRobot.kbmRobotStrings.DollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracket = "${_MouseButton}${_MouseButton}${_MouseButton}".asInstanceOf[typings.kbmRobot.kbmRobotStrings.DollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracketDollarLeftcurlybracket_MouseButtonRightcurlybracket]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.kbmRobot.kbmRobotStrings.`1`
    - typings.kbmRobot.kbmRobotStrings.`2`
    - typings.kbmRobot.kbmRobotStrings.`3`
  */
  trait _MouseButton extends StObject
  object _MouseButton {
    
    inline def `1`: typings.kbmRobot.kbmRobotStrings.`1` = "1".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`1`]
    
    inline def `2`: typings.kbmRobot.kbmRobotStrings.`2` = "2".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`2`]
    
    inline def `3`: typings.kbmRobot.kbmRobotStrings.`3` = "3".asInstanceOf[typings.kbmRobot.kbmRobotStrings.`3`]
  }
  
  type _To = KBMRobot
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: KBMRobot = ^
}

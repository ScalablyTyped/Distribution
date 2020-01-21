organization := "org.scalablytyped"
name := "material-components-web"
version := "3.2.0-d6d233"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-51800a",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-9a5610",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20191126Z-e457f2",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20191126Z-15293e",
  "org.scalablytyped" %%% "material__data-table" % "3.2.0-f4ee43",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20191126Z-d1e800",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20191126Z-351b7d",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-b510eb",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20191126Z-d41ea6",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20191126Z-ae8519",
  "org.scalablytyped" %%% "material__icon-button" % "3.2.0-2016f7",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-f7ce7e",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20191126Z-a50cd9",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20191126Z-1c078d",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20191126Z-68476a",
  "org.scalablytyped" %%% "material__menu-surface" % "3.2.0-7a9291",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-17bce0",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20191126Z-154076",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-4ad89c",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20191126Z-bf0a6a",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-242994",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20191126Z-71d860",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20191126Z-b2749b",
  "org.scalablytyped" %%% "material__switch" % "3.2.0-1ebe93",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20191126Z-b20323",
  "org.scalablytyped" %%% "material__tab-bar" % "3.2.0-1ad170",
  "org.scalablytyped" %%% "material__tab-indicator" % "3.1.0-83af21",
  "org.scalablytyped" %%% "material__tab-scroller" % "3.2.0-213424",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20191126Z-83cee9",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20191126Z-8b8292",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        
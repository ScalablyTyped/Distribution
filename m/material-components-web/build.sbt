organization := "org.scalablytyped"
name := "material-components-web"
version := "3.2.0-c4eed8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-8a9374",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-b8d27a",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20191126Z-78f2d9",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20191126Z-5baea5",
  "org.scalablytyped" %%% "material__data-table" % "3.2.0-04d0b0",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20191126Z-dbb1b9",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20191126Z-35fd11",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-23ea66",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20191126Z-7a9dc6",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20191126Z-0109da",
  "org.scalablytyped" %%% "material__icon-button" % "3.2.0-0fbb98",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-26c330",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20191126Z-16f03b",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20191126Z-c90948",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20191126Z-438744",
  "org.scalablytyped" %%% "material__menu-surface" % "3.2.0-97589c",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-58257d",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20191126Z-e03760",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-6fb41d",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20191126Z-ddf6bc",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-6622fd",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20191126Z-7efd89",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20191126Z-b5781e",
  "org.scalablytyped" %%% "material__switch" % "3.2.0-20e69a",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20191126Z-b11c30",
  "org.scalablytyped" %%% "material__tab-bar" % "3.2.0-6b4be1",
  "org.scalablytyped" %%% "material__tab-indicator" % "3.1.0-de0648",
  "org.scalablytyped" %%% "material__tab-scroller" % "3.2.0-4fe6a2",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20191126Z-6149a8",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20191126Z-ee2223",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        
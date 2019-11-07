organization := "org.scalablytyped"
name := "material-components-web"
version := "3.2.0-887ef0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-87329f",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-7e7097",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-cefa06",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-4fb4c0",
  "org.scalablytyped" %%% "material__data-table" % "3.2.0-94c29a",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-1f1abc",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-06a273",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-3a4658",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-25a0ce",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-bf4cee",
  "org.scalablytyped" %%% "material__icon-button" % "3.2.0-b93bab",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-5a8cc4",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-ddd6f3",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-681b1c",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-a731c2",
  "org.scalablytyped" %%% "material__menu-surface" % "3.2.0-d7fdd6",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-1991f9",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-cca8f0",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-36d274",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-4f07ac",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-f7898e",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-d2ac25",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-b01edf",
  "org.scalablytyped" %%% "material__switch" % "3.2.0-95d88d",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20190717Z-69d10d",
  "org.scalablytyped" %%% "material__tab-bar" % "3.2.0-e93417",
  "org.scalablytyped" %%% "material__tab-indicator" % "3.1.0-632cfc",
  "org.scalablytyped" %%% "material__tab-scroller" % "3.2.0-0ead8e",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-ebebe2",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-5ed044",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        
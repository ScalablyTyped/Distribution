organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-8d8445"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-75fec6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-16a469",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190213Z-45ea98",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-26e5a2",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190213Z-04cde6",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190213Z-093960",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-cf9397",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-13b7ce",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190213Z-67a072",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-a87738",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190213Z-de48ef",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-2c6d7e",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-027f12",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190213Z-b18d32",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-72e6bc",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-130e93",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190213Z-699d4a",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-20b376",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190213Z-2965f3",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-db7a7a",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190213Z-1043d2",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190213Z-d4955d",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190213Z-3d1fb2",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190213Z-05888c",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190213Z-40feda",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-fc84eb",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
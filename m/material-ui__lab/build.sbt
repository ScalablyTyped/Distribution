organization := "org.scalablytyped"
name := "material-ui__lab"
version := "4.0.0-alpha.56-96c881"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-76e421",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-e348a6",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-f50e20",
  "org.scalablytyped" %%% "jss" % "10.5.0-9884b6",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-7ac93a",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-ecd08f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-343569",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
